# Portfolio and Pricing Microservices Setup Guide

## Steps

### 1. Start Consul Agent in Development Mode

Open a terminal and run:

```bash
consul agent -dev
```

### 2. Run PortfolioApplication

1. Open `PortfolioApplication` in IntelliJ IDEA.
2. Run the application using the provided run configuration.

### 3. Run PricingApplication

1. Open `PricingApplication` in IntelliJ IDEA.
2. Run the application using the provided run configuration.

### 4. Check Microservices Registration

Go to [Consul UI](http://localhost:8500) to ensure the microservices are registered.

### 5. Test the Portfolio Application

Test the application using the following URL:

[Test Portfolio Application](http://localhost:57116/portfolios/customer/0/portfolio/2)

