 
 ### Task for execution
 
 1. Create a SOAP server which will return `Hello World`
 2. Create a test for making request to the **SOAP** server
 3. Create a test with fail
 4. Create a SOAP server which will receive a parameter and return  `Good Morning` if a value of the parameter is ***morning***, 'Good evening' if a value of the parameter is ***evening***. In another cases 'Incorrect value of the parameter' should be returned.
 5. Create tree test for service from item 4.
 6. Create a service which puts input data into a table of a database(MySQL).
 7. Create a service which guts data from the table.
 8. Create 1 test for item 6 and 1 test for item 7.
 
 ### Second part 
 
 9. Install Jenkins.
 10. Configure a job for a test suite of two tests from item 1 and 2.
 11. Configure a job for a test suite of tests from item 5. This Jenkins job should be run after successful running the job from item 10.
 12. Configure a job for a test suite of two tests from item 8. This job should be run after job from item 11 independently on result
 13. Run three Jenkins jobs