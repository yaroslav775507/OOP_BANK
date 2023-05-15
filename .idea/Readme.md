Создайте класс Bank Account. Класс должен иметь приватные поля для:
●	Id: int(начинается с 1 и увеличивается с каждый новым счетом)
●	Balance: double
●	Interest rate: double (процентная ставка: 0.02)
Также у класса должны быть публичные методы:
●	setInterestRate(double interest): void (static)(статический метод, общий для всех аккаунтов)
●	getInterest(int Years): double
●	deposit(double amount): void
Метод main главного класса должен поддерживать следующие команды:
●	Create
●	Deposit {Id} {Amount}
●	SetInterest {Interest}
●	GetInterest {ID} {Years}
●	End
