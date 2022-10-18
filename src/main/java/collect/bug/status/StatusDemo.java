package collect.bug.status;

/**
 * @author wzq
 * Created on 2022-10-08
 *
 * 【Attention】Generally the client will map the error codes returned by the server to three states: success,processing and fail. When this mapping logic is incorrect or the processing logic for the pending status is
 *   incorrect, this can lead to a direct loss of capital.
 */
public class StatusDemo {

    /**
     *  follow the rules
     *  1、The flow of internal business state requires a clear state flow diagram and actions to trigger the
     *     flow of state, and mechanisms (compensation, retries, monitoring and manual intervention, etc.) to
     *     facilitate the flow of intermediate to final state.
     * 2、 The code implementation for updating state must use an optimistic locking to update the data and
     *     check the number of rows returned by the update.
     * 3、 Data in the final state is not allowed to be updated twice. Hard-coded checks can be done in the DAO
     *     layer if necessary.
     * 4、 It is important to ensure that state migration is consistent with the business logic.
     */

}
