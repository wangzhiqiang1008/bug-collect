# bug-collect
## What is capital loss ？
Definition: A capital loss is any direct or indirect financial loss suffered by the company or its customers as a result of faulty product design, abnormal product implementation, staff error, etc.

Causes of capital loss: product design defects, product realization anomalies, and staff operational errors.

Consequences: direct or indirect financial loss to the company or its customers.

## Common capital loss risk points 

### 1、Error codes and status

The error code processing logic is most commonly used for interfacing with three-party channels (Paypal, Alipay, etc.) and for cross-system interface calls.

Usually, the client will map the error code returned by the server to three states: success, processing, and failure. When there is an error in this mapping logic or incorrect processing logic for the outstanding states, it may directly lead to a loss of capital.

### 2、Idempotent check and idempotent bill number generation

### 3、Data calculation

### 4、Database usage

### 5、Environment isolation

### 6、Cross-system compensation logic implementation

### 7、Parameter legitimacy checks

### 8、Compatibility issues

### 9、Information or data security
