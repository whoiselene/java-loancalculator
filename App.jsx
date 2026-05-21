import { useState } from "react"

function App() {

  const [principal, setPrincipal] = useState("")
  const [interestRate, setInterestRate] = useState("")
  const [months, setMonths] = useState("")
  const [loanType, setLoanType] = useState("mortgage")

  function calculateLoan() {

    const principalNumber = Number(principal)
    const interestNumber = Number(interestRate)
    const monthsNumber = Number(months)

    const monthlyPrincipal =
      principalNumber / monthsNumber

    let remainingDebt = principalNumber

    let totalPayment = 0

    const payments = []

    for (let i = 0; i < monthsNumber; i++) {

      let interest

      if (loanType === "mortgage") {

        interest =
          remainingDebt * interestNumber / 100

      } else {

        interest =
          principalNumber * interestNumber / 100

      }

      const monthlyPayment =
        monthlyPrincipal + interest

      remainingDebt -= monthlyPrincipal

      totalPayment += monthlyPayment

      payments.push({
        month: i + 1,
        payment: monthlyPayment.toFixed(2),
        remainingDebt: remainingDebt.toFixed(2)
      })

    }

    alert(
      "Total Payment: $" +
      totalPayment.toFixed(2)
    )

    console.log(payments)

  }

  return (

    <div className="container">

      <div className="card">

        <h1>LoanMind</h1>

        <input
          type="number"
          placeholder="Principal Amount"
          onChange={(e) =>
            setPrincipal(e.target.value)
          }
        />

        <input
          type="number"
          placeholder="Interest Rate"
          onChange={(e) =>
            setInterestRate(e.target.value)
          }
        />

        <input
          type="number"
          placeholder="Months"
          onChange={(e) =>
            setMonths(e.target.value)
          }
        />

        <select
          onChange={(e) =>
            setLoanType(e.target.value)
          }
        >

          <option value="mortgage">
            Mortgage Loan
          </option>

          <option value="student">
            Student Loan
          </option>

        </select>

        <button onClick={calculateLoan}>
          Calculate Loan
        </button>

      </div>

    </div>

  )

}

export default App