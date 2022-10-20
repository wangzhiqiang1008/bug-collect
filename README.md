# bug-collect
## What is capital loss ？
Definition: A capital loss is any direct or indirect financial loss suffered by the company or its customers as a result of faulty product design, abnormal product implementation, staff error, etc.

Causes of capital loss: product design defects, product realization anomalies, and staff operational errors.

Consequences: direct or indirect financial loss to the company or its customers.

## Common capital loss risk points 

### 1、Error codes and status

The error code processing logic is most commonly used for interfacing with three-party channels (Paypal, Alipay, etc.) and for cross-system interface calls.

Usually, the client will map the error code returned by the server to three states: success, processing, and fail. When there is an error in this mapping logic or incorrect processing logic for the outstanding states, it may directly lead to a loss of capital.

### 2、Idempotent check 

Distributed scenarios where strong consistent protocols or distributed transactions are implemented between multiple systems are extremely complex and difficult. The simplest and most reliable implementation is to achieve eventual consistency through a compensation mechanism, which requires the server to return the same response when receiving a duplicate request, and that the side effects of multiple operations with the same parameters are the same as those of a single operation. This allows the caller to safely compensate for retries (where "duplicate" and "identical" are understood to be more focused on business parameters and do not include parameters such as signs, expiry times, etc.).

### 3、Data calculation

### 4、Database usage

### 5、Environment isolation

### 6、Cross-system compensation logic implementation

Compensation logic is a common solution to guarantee final consistency, generally with two types of actions: retry requests and inquiry orders, and in most cases, each applies to the following scenarios.
(1) Retry requests.
	I: Internal balance entry scenarios where there will be no business failure. Such as sending money, basically will not have a failure situation.
(2) Inquiry order compensation.
	I: Scenarios where there is business failure. such as cash withdrawal, refund and other scenarios will cause business failure due to the user's channel account being frozen, canceled, etc.
	II:  the user initiates balance spending. For example, if a user clicks on a gift during a live broadcast and there is an exception, the compensation task at this time should go to do a checklist action to determine whether this gift is successfully consumed, instead of retrying
  
### 7、Parameter legitimacy checks

### 8、Compatibility issues

In a distributed scenario, it is difficult to guarantee that operations such as service upgrades and switch releases can be completed instantaneously at any given moment, and there are bound to be situations where old and new logic co-exist during the operation. This is when compatibility issues are likely to arise.

### 9、Information or data security


