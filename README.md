# java-loancalculator
<div align="center">

```
 _     ___   _   _  _   _  _   _   _  _   ___
| |   / _ \ / \ | \| | | \/ | | | | \| | |  _ \
| |__| (_) / _ \| .` | | |\ | | | | .| | |_| |
|____|\___/_/ \_\_|\_| |_||_| |_| |_|\_| |____/
```

### **Simulate. Analyze. Understand.**
*A financial planning & loan calculation application — IB CS Standard Level*

<br>

 <img width="984" height="640" alt="image" src="https://github.com/user-attachments/assets/e751aa72-a19f-45da-8cef-15fb2316e206" /> <img width="520" height="539" alt="Screenshot 2026-05-21 at 03 31 44" src="https://github.com/user-attachments/assets/aa70c3a8-cfc2-4131-803e-aac33fcd4d4e" />


![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Vite](https://img.shields.io/badge/Vite-646CFF?style=for-the-badge&logo=vite&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)

![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)
![IB](https://img.shields.io/badge/IB_CS-Standard_Level-gold?style=flat-square)
![License](https://img.shields.io/badge/License-Educational-blue?style=flat-square)
![PRs](https://img.shields.io/badge/PRs-Welcome-ff69b4?style=flat-square)

</div>

---

<br>

<div align="center">

```
┌─────────────────────────────────────────────────────────────┐
│                                                             │
    💰  Principal  →  📊  Calculate  →  📅  Schedule  → ✅      
│                                                             │
└─────────────────────────────────────────────────────────────┘
```

</div>

<br>

## ◈ What is LoanMind?

> **LoanMind** is a Java-powered financial planning tool that helps users simulate, analyze, and understand real-world loan scenarios — mortgages, student loans, personal loans, and more. Built as an IB Computer Science SL project, it combines rigorous financial mathematics with modern software architecture.

The core idea is simple: **demystify loans**. Interest rates, repayment schedules, and total costs can be confusing. LoanMind makes them visual, interactive, and clear.

<br>

---

## ◈ Feature Overview

<br>

```
╔══════════════════════════════════════════════════════════════════╗
║                     CORE FEATURE MATRIX                          ║
╠══════════════════════╦═══════════════════════════════════════════╣
║  🏦 Loan Calculator  ║  Monthly payments · Total cost · APR      ║
╠══════════════════════╬═══════════════════════════════════════════╣
║  📅 Schedule View    ║  Month-by-month breakdown · Balance track ║
╠══════════════════════╬═══════════════════════════════════════════╣
║  🏠 Loan Types       ║  Mortgage · Student · Personal · Custom   ║
╠══════════════════════╬═══════════════════════════════════════════╣
║  🛡️ Input Validation ║  No negatives · No empty fields · Guards  ║
╠══════════════════════╬═══════════════════════════════════════════╣
║  📊 Debt Progression ║  Remaining balance tracked every period   ║
╚══════════════════════╩═══════════════════════════════════════════╝
```

<br>

### 🏦 Loan Calculation Engine

Calculate with precision:

- ✦ **Monthly repayment amount** using standard amortization formula
- ✦ **Total payment** over the full loan lifetime
- ✦ **Total interest paid** vs principal breakdown
- ✦ **Comparison** across different loan conditions
- ✦ **Remaining balance** tracked for every period

<br>

### 📅 Repayment Schedule

Every loan generates a full month-by-month plan:

```
Month │  Payment  │  Interest  │  Principal  │  Balance
──────┼───────────┼────────────┼─────────────┼──────────
  1   │  $412.29  │   $135.42  │   $276.87   │ $24,723
  2   │  $412.29  │   $133.92  │   $278.37   │ $24,445
  3   │  $412.29  │   $132.41  │   $279.88   │ $24,165
  ·   │     ·     │      ·     │      ·      │    ·
  60  │  $412.29  │     $2.23  │   $410.06   │   $0.00
```

<br>

### 🏠 Supported Loan Types

| Type | Description | Use Case |
|------|-------------|----------|
| 🏠 **Mortgage** | Long-term property loans | Home buying |
| 🎓 **Student** | Education financing | University costs |
| 💳 **Personal** | General-purpose loans | Flexible needs |
| ⚙️ **Custom** | User-defined repayment | Any scenario |

<br>

---

## ◈ Tech Stack

<br>

<div align="center">

```
                    ┌─────────────────┐
                    │    FRONTEND     │
                    │  React + Vite   │
                    │   JavaScript    │
                    │      CSS        │
                    └────────┬────────┘
                             │
                    ┌────────▼────────┐
                    │  CORE  LOGIC    │
                    │      Java       │
                    │  OOP Classes    │
                    │   Algorithms    │
                    └────────┬────────┘
                             │ 
                    ┌────────▼────────┐
                    │      TOOLS      │
                    │     VS Code     │
                    │ IntelliJ IDEA   │
                    │      Vite       │
                    └─────────────────┘
```

</div>

<br>

**Backend / Core Logic**
```
Java ──────────────────────────────────────── Core language
OOP ───────────────────────────────────────── Architecture pattern
Algorithms ────────────────────────────────── Repayment math
```

**Frontend**
```
React ─────────────────────────────────────── UI framework
JavaScript ────────────────────────────────── Interactivity
CSS ───────────────────────────────────────── Styling
Vite ──────────────────────────────────────── Build tool
```

<br>

---

## ◈ Architecture & OOP Design

<br>

```
                         LoanMind System
                         ══════════════

        ┌───────────────────────────────────────────────┐
        │                  Loan (Base)                  │
        │  - principal  - rate  - term  - type          │
        │  + calculate()  + validate()  + getSummary()  │
        └──────────────────────┬────────────────────────┘
                               │
              ┌────────────────┼────────────────┐
              │                │                │
    ┌─────────▼──────┐ ┌───────▼──────┐ ┌──────▼────────┐
    │  MortgageLoan  │ │ StudentLoan  │ │ PersonalLoan  │
    │  + fixedRate   │ │  + gracePer  │ │  + flexTerm   │
    └────────────────┘ └──────────────┘ └───────────────┘
              │                │                │
              └────────────────┼────────────────┘
                               │
                    ┌──────────▼──────────┐
                    │   LoanCalculator    │
                    │  + computePayment() │
                    │  + buildSchedule()  │
                    │  + compare()        │
                    └──────────┬──────────┘
                               │
                    ┌──────────▼──────────┐
                    │      Payment        │
                    │  - amount  - month  │
                    │  - interest - prin  │
                    └─────────────────────┘
```

<br>

### Classes at a Glance

| Class | Responsibility |
|-------|---------------|
| `Loan` | Base class — holds principal, rate, term, type |
| `LoanCalculator` | Performs all amortization math |
| `Payment` | Represents a single payment period |
| `MortgageLoan` | Extends Loan with mortgage-specific logic |
| `StudentLoan` | Extends Loan with grace period handling |

<br>

---

## ◈ CS Concepts Applied

<br>

```
 ╭──────────────────────────────────────────────────────────────╮
 │                                                              │
 │   01  Object-Oriented Programming ────────────── ████████░   │ 
 │   02  Arrays & Collections ───────────────────── ███████░░   │
 │   03  Loops & Iteration ──────────────────────── ████████░   │
 │   04  Conditional Logic ──────────────────────── ██████░░░   │
 │   05  Functions & Methods ────────────────────── ████████░   │
 │   06  Input Validation ───────────────────────── █████░░░░   │
 │   07  Frontend Integration ───────────────────── ██████░░░   │
 │   08  Algorithmic Thinking ───────────────────── ███████░░   │
 │                                                              │
 ╰──────────────────────────────────────────────────────────────╯
```

<br>

**🔷 Object-Oriented Programming**
The system is divided into dedicated classes — `Loan`, `Payment`, `LoanCalculator` — each with a clear single responsibility. Inheritance allows different loan types to share core logic while overriding specific behaviors.

**🔷 Arrays & Collections**
Repayment schedules are stored as ordered collections, enabling indexed access to any month's payment data and full iteration over the entire plan.

**🔷 Loops & Iteration**
The amortization engine loops through every period, calculating interest, reducing principal, and updating balance until the loan is fully repaid.

**🔷 Input Validation**
Guards against negative values, empty inputs, zero-term loans, and unrealistic financial data — improving both reliability and user experience.

<br>

---

## ◈ Project Structure

<br>

```
loanmind/
│
├── 📁 src/
│   ├── 📁 backend/
│   │   ├── 📄 Loan.java                ← Base loan model
│   │   ├── 📄 LoanCalculator.java      ← Core math engine
│   │   ├── 📄 Payment.java             ← Payment period model
│   │   ├── 📄 MortgageLoan.java        ← Mortgage extension
│   │   └── 📄 StudentLoan.java         ← Student loan extension
│   │
│   └── 📁 frontend/
│       ├── 📄 main.jsx                 ← App entry point
│       ├── 📄 App.jsx                  ← Root component
│       ├── 📁 components/
│       │   ├── 📄 LoanForm.jsx         ← Input controls
│       │   ├── 📄 Summary.jsx          ← Results display
│       │   └── 📄 Schedule.jsx         ← Repayment table
│       └── 📁 styles/
│           └── 📄 main.css             ← Global styles
│
├── 📄 index.html                       ← HTML shell
├── 📄 vite.config.js                   ← Vite config
└── 📄 README.md                        ← You are here
```

<br>

---

## ◈ The Math Behind It

<br>

LoanMind uses the standard **amortization formula** to calculate fixed monthly payments:

<br>

```
         P × r × (1 + r)ⁿ
  M  =  ──────────────────
           (1 + r)ⁿ − 1

  Where:
    M  =  Monthly payment
    P  =  Principal (loan amount)
    r  =  Monthly interest rate  (APR ÷ 12)
    n  =  Total number of payments  (years × 12)
```

<br>

Each month, interest is recalculated on the **remaining balance**, so the interest portion shrinks and the principal portion grows — this is the amortization effect.

<br>

---

## ◈ Educational Context

<br>

> This project was built as part of the **IB Diploma Programme Computer Science Standard Level** coursework.

<br>

Learning outcomes demonstrated:

```
 [✓]  Designing modular, maintainable object-oriented systems
 [✓]  Implementing real-world algorithms (amortization)
 [✓]  Applying data structures to financial problems
 [✓]  Building interactive user interfaces with React
 [✓]  Validating and handling user input robustly
 [✓]  Connecting frontend interfaces to backend logic
 [✓]  Debugging, testing, and iterating on software
```

<br>

---

## ◈ Roadmap

<br>

```
  NOW ────────────────────────────────────────────── FUTURE
   │                                                    │
   ▼                                                    ▼

  [✅] Core loan calculator         [🔲] Graphical payment charts
  [✅] Amortization schedule        [🔲] Loan comparison dashboard
  [✅] Multiple loan types          [🔲] Repayment history saving
  [✅] Input validation             [🔲] User authentication
  [✅] React frontend               [🔲] Mobile-responsive design
                                    [🔲] Exportable PDF reports
                                    [🔲] Database integration
                                    [🔲] Advanced analytics
```

<br>

---

## ◈ Getting Started

<br>

**Clone the repository**
```bash
git clone https://github.com/yourusername/loanmind.git
cd loanmind
```

**Install frontend dependencies**
```bash
npm install
```

**Run the development server**
```bash
npm run dev
```

**Compile the Java backend**
```bash
javac src/backend/*.java
java src/backend/LoanCalculator
```

<br>

---

<div align="center">

```
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
```

**LoanMind** — Built  for IB Computer Science SL

*Combining financial mathematics with software engineering*

```
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
```

![Java](https://img.shields.io/badge/Made_with-Java-ED8B00?style=flat-square&logo=openjdk)
![React](https://img.shields.io/badge/UI-React-61DAFB?style=flat-square&logo=react)
![IB](https://img.shields.io/badge/IB_CS-SL_Project-gold?style=flat-square)

</div>
