package collect.bug.database;

/**
 * @author wzq
 * Created on 2022-10-09
 */
public class databaseDemo {

    /**
     * Exceptions catch in the transaction, not thrown, resulting in no rollback of transaction execution
     */
    public void demo() {
//        DataSourceTransactions.trx(payShard, tpl -> {
//
//            UserBalance balance = userBalanceDAO.getInTrx(tpl, userId);// 1.query balance
//
//            Statement statement = buildStatement(request, balance);// 2.inert record
//            try{
//                statementDAO.insertInTrx(tpl, statement);
//            } catch(DuplicateKeyException e) {
//                logger.error(......);
//                perf(......).logstash();
//            }
//            userBalanceDAO.updateInTrx(tpl, statement, balance);// 3.update balance
//        });
    }

    /**
     * follow the rules
     *
     *[Database table creation]
     *  1、When declaring database field types, try to declare them as NOT NULL. index columns must be declared as NOT
     *     NULL, and when index columns are of the type VARCHAR they must be set to a reasonable length, not exceeding
     *     the maximum length of the index column.
     *  2、Database table sorting rules need to be declared as case sensitive, e.g. COLLATE = utf8mb4_bin.
     *
     * [Database  usage]
     *  1、String splicing to generate SQL parameters is strictly forbidden and must be constructed separately from
     *  the SQL in order to pre-compile the SQL to avoid injection problems.
     *
     *  2、SQL parameter types need to correspond to database table types, implicit type conversion on MySQL is not allowed.
     *
     *  3、The ignore operation should be used with caution in SQL, otherwise, it will lead to implicit data truncation,
     *    type conversion, wrong data is automatically adjusted to the closest value, etc.
     *
     *  4、After the execution of the update or insert SQL is complete, you must verify that the number of rows returned
     *     for impact is as expected.
     *
     *  5、When updating record status fields, updates must be performed using the optimistic locking mechanism. If
     *    necessary, it can be checked operationally that no status rollback can occur.
     *
     *  6、When updating a field of type Balance, overriding the original value is not allowed and must be calculated
     *     based on the original field value.
     *
     * [Use of transactions]
     *
     *  1、Transactions across connections are strictly prohibited in the transaction implementation logic. When using
     *     tools such as TransactionUtils, make sure you are using the same JdbcTemplate to complete the transaction logic.
     *
     *  2、In transactions where there is both a select and an update for the same record, it is important to obtain a
     *     write lock on the record as early as possible to reduce the probability of deadlocks and to avoid the problems
     *     associated with snapshot reads.
     *
     *  3、The transaction prohibits catching unexpected exceptions and does not allow fail-safe. （DuplicatedKeyException）
     *
     *  4、Pessimistic locking concurrency control requires strict adherence to the one-lock, two-judge, three-update principle.
     * 	    One lock: lock the resource to be read or written by the target, and process concurrent requests serially
     * 	    Two judgments: based on the latest content of the locked resource, verify its status, amount, and other data
     * 	    Three updates: the second step is judged before the subsequent write logic is executed
     *
     */


    /**
     * [Database  usage] 1
     */
    public void  stringSplicingDemo(){
          // Incorrect
//        insert into test values('"+id+"','"+name+"');

          // Correct
//        string cmd = "insert into test values(@id,@name)";
//        MySqlParameter[] paras ={undefined
//                new MySqlParameter("@id",MySqlDbType.String),
//                new MySqlParameter("@name",MySqlDbType.String)
//        };
//        paras[0].Value = ID;
//
//        paras[1].Value = Name;
    }

    /**
     * [Database  usage] 6
     */
    public void  updateBalanceDemo(){
          // Incorrect
//        update wallet set balance = 1900 ...

          // Correct
//        update wallet set balance = balance - 100 ...

    }




}
