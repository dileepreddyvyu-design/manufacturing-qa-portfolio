# Manufacturing QA Portfolio – Manual, UI/API Automation, SQL, and Performance Testing

This portfolio demonstrates a **full QA lifecycle** for a fictional manufacturing workflow system, covering:

- **Manual Testing** – Test plans, test cases, RTM, defect logs
- **UI Automation** – Selenium WebDriver (Java + TestNG)
- **API Testing** – Postman + Newman CLI
- **Performance Testing** – Apache JMeter
- **Database Validation** – SQL queries for backend checks
- **Agile Documentation** – User stories, acceptance criteria, sprint artifacts
- **Continuous Integration** – GitHub Actions workflows

---

## Tools & Technologies

| Area                 | Tools / Technologies |
|----------------------|----------------------|
| **Manual Testing**   | Excel, Jira/GitHub Issues |
| **UI Automation**    | Selenium WebDriver, Java, TestNG, Maven, WebDriverManager |
| **API Testing**      | Postman, Newman CLI |
| **Performance**      | Apache JMeter |
| **Database**         | MySQL / Oracle SQL |
| **Version Control**  | Git, GitHub |
| **Methodologies**    | Agile/Scrum, STLC |

---

## Project Structure
📂 .github/workflows     → GitHub Actions CI configurations
📂 agile-docs            → User stories, acceptance criteria, sprint backlog
📂 automation            → Selenium UI automation framework
📂 test-data              → CSV, JSON, Excel files for test input
📂 docs                   → Test plans, RTM, defect logs, requirements
📂 sql                    → SQL scripts for database validation
📂 manual-tests           → Manual test cases
📂 performance            → JMeter performance test scripts & reports
📂 api-tests              → Postman collections for API testing


---

## 📋 Manual Testing Deliverables

- **Test Plan** – Scope, objectives, risks, entry/exit criteria
- **Test Cases** – 50+ scenarios for functional, regression, smoke, and negative testing
- **Traceability Matrix** – Mapping requirements to test cases
- **Defect Log** – Detailed bug reports with severity, steps, and screenshots

---

## UI Automation
Automated flows for:

Order creation and approval

Inventory updates

Shipping confirmation

Cross-browser support (Chrome, Edge)

Assertions for UI validations and text checks

**Run automation:**
```bash
cd automation
mvn clean test
mvn clean test -Dbrowser=edge
```

## API Testing
Validations for:

Order creation APIs

Status update APIs

Inventory APIs

**Run API tests (Newman CLI):**
```bash
cd api-tests
newman run manufacturing.postman_collection.json \
    -e manufacturing_environment.json \
    --reporters cli,html \
    --reporter-html-export api-test-report.html
```

Reports:
[HTML API Report](surefire-reports/emailable-report.html)

## Performance Testing (JMeter)
20 virtual users, 60-second ramp-up
Scenarios tested:
Bulk order processing
Inventory queries

**Run JMeter test:**
```bash
jmeter -n -t performance/manufacturing_load_test.jmx -l results.jtl -e -o performance-report
```

Reports:
Performance Report Dashboard

## Database Validation (SQL)
SQL scripts for:
Order status checks
Inventory balance validations
Shipment tracking
Queries verified against MySQL backend

## Reports
| Report Type        | File Path / Location                         | Description                                          |
| ------------------ | -------------------------------------------- | ---------------------------------------------------- |
| **Manual Testing** | `/docs/TestPlan_and_Results.xlsx`            | Detailed test plan, scenarios, and execution results |
| **UI Automation**  | `/automation/target/emailable-report.html`   | HTML report for Selenium automation runs             |
| **API Testing**    | `/docs/api-test-report.html`                 | HTML report for API test execution (Newman)          |
| **Performance**    | `/performance/performance-report/index.html` | JMeter dashboard for load & stress test results      |


## How to Run
**UI Automation:**
```bash
cd automation
mvn clean test
```

**API Testing:**
```bash
cd api-tests
newman run manufacturing.postman_collection.json \
    -e manufacturing_environment.json
```

**Performance Testing:**
```bash
jmeter -n -t performance/manufacturing_load_test.jmx \
    -l results.jtl -e -o performance-report
```

## Author

Dileep Reddy Vyvyuru
vyvyurudileepreddy@gmail.com
