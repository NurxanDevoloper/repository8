package DIP;

// DIP (Dependency Inversion Principle) — Принцип инверсии зависимостей, один из принципов SOLID.

// Суть DIP
// Модули верхнего уровня(высокоуровневые классы)не должны зависеть от модулей нижнего уровня.Оба должны зависеть от абстракций(интерфейсов).Абстракции не должны зависеть от деталей.Детали должны зависеть от абстракций.

public interface PaymentProcessor {
	void processPayment(double amount);
}
