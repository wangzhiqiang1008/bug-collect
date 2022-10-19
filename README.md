# bug-collect
## What is capital loss ？
Definition: A capital loss is any direct or indirect financial loss suffered by the company or its customers as a result of faulty product design, abnormal product implementation, staff error, etc.

Causes of capital loss: product design defects, product realization anomalies, and staff operational errors.

Consequences: direct or indirect financial loss to the company or its customers.

## Common capital loss risk points 

### Error codes and status

The error code processing logic is most commonly used for interfacing with three-party channels (Paypal, Alipay, etc.) and for cross-system interface calls.

Usually, the client will map the error code returned by the server to three states: success, processing, and failure. When there is an error in this mapping logic or incorrect processing logic for the outstanding states, it may directly lead to a loss of capital.

Power Check and Power Order Number Generation

Data calculation

Database usage

Environment isolation

Cross-system compensation logic implementation

Parameter legitimacy checks

Compatibility issues

Information or data security
