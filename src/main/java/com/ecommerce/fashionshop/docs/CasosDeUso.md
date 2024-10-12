# Documentação do Sistema de E-commerce

## Visão Geral
Este documento descreve os requisitos funcionais e não funcionais do sistema, além das principais classes e métodos utilizados no desenvolvimento de um e-commerce simples utilizando **Spring Boot**. O foco do sistema está na gestão de produtos, carrinho de compras, pedidos e usuários, com funcionalidades essenciais para operações de venda online.

---

## Requisitos Funcionais

1. **Cadastro de Produtos**
   - Permitir que o administrador cadastre, atualize, remova e visualize produtos, incluindo nome, descrição, preço, quantidade e categoria.

2. **Visualização de Produtos**
   - Permitir que os usuários visualizem uma lista de produtos com filtros por categoria.

3. **Carrinho de Compras**
   - Adicionar, remover e atualizar a quantidade de produtos no carrinho.
   - Exibir os itens adicionados ao carrinho para o usuário.

4. **Processamento de Pedidos**
   - Finalizar um pedido com os produtos do carrinho, calculando o valor total e removendo os itens do estoque.

5. **Gerenciamento de Usuários**
   - Permitir o registro e login de usuários, protegendo ações sensíveis para usuários autenticados.

6. **Histórico de Pedidos**
   - Exibir o histórico de pedidos realizados pelos usuários.

---

## Requisitos Não Funcionais

1. **Desempenho**
   - O sistema deve processar as operações do carrinho e de visualização de produtos em menos de 1 segundo.

2. **Escalabilidade**
   - O sistema deve ser capaz de lidar com aumentos de usuários e pedidos, como em eventos promocionais.

3. **Segurança**
   - As senhas dos usuários devem ser armazenadas com hash.
   - Endpoints sensíveis devem ser protegidos com autenticação e autorização.

4. **Disponibilidade**
   - O sistema deve ter uma disponibilidade de 99,9%.

5. **Manutenibilidade**
   - O código deve ser modular, permitindo fácil manutenção e extensão.

6. **Usabilidade**
   - A interface deve ser intuitiva e o processo de compra, simplificado.

7. **Compatibilidade**
   - Compatível com navegadores modernos e responsivo para diferentes dispositivos.

---

## Principais Classes e Métodos

### 1. **Produto (Product)**

**Classe:** `Product`
- Atributos:
  - `id`
  - `name`
  - `description`
  - `price`
  - `stockQuantity`
  - `category`

**Métodos do `ProductService`:**
- `createProduct(Product product)` – Cria um novo produto.
- `updateProduct(Long id, Product updatedProduct)` – Atualiza um produto existente.
- `deleteProduct(Long id)` – Remove um produto pelo ID.
- `getAllProducts()` – Lista todos os produtos.
- `getProductById(Long id)` – Retorna detalhes de um produto específico.
- `getProductsByCategory(String category)` – Filtra produtos por categoria.

---

### 2. **Carrinho de Compras (Cart)**

**Classe:** `Cart`
- Atributos:
  - `id`
  - `user`
  - `items` (Lista de `CartItem`)

**Classe:** `CartItem`
- Atributos:
  - `id`
  - `product`
  - `quantity`

**Métodos do `CartService`:**
- `addItemToCart(Long userId, Long productId, int quantity)` – Adiciona um produto ao carrinho.
- `removeItemFromCart(Long userId, Long productId)` – Remove um produto do carrinho.
- `updateItemQuantity(Long userId, Long productId, int quantity)` – Atualiza a quantidade de um produto no carrinho.
- `getCartByUserId(Long userId)` – Retorna o carrinho do usuário.
- `clearCart(Long userId)` – Limpa o carrinho do usuário.

---

### 3. **Pedido (Order)**

**Classe:** `Order`
- Atributos:
  - `id`
  - `user`
  - `items` (Lista de `OrderItem`)
  - `totalPrice`
  - `orderDate`
  - `status`

**Classe:** `OrderItem`
- Atributos:
  - `id`
  - `product`
  - `quantity`
  - `price`

**Métodos do `OrderService`:**
- `createOrder(Long userId)` – Cria um novo pedido a partir do carrinho do usuário.
- `getOrderById(Long orderId)` – Retorna detalhes de um pedido específico.
- `getOrdersByUserId(Long userId)` – Lista os pedidos de um usuário.
- `calculateTotalPrice(Long userId)` – Calcula o valor total dos itens no carrinho para o pedido.

---

### 4. **Usuário (User)**

**Classe:** `User`
- Atributos:
  - `id`
  - `name`
  - `email`
  - `password`
  - `roles` (ex.: `admin`, `customer`)
  - `orders` (Lista de `Order`)

**Métodos do `UserService`:**
- `registerUser(User user)` – Registra um novo usuário.
- `login(String email, String password)` – Autentica um usuário.
- `getUserById(Long userId)` – Retorna detalhes de um usuário.
- `updateUser(Long userId, User updatedUser)` – Atualiza as informações de um usuário.

---

### 5. **Autenticação e Segurança**

**Métodos do `AuthenticationService`:**
- `login(String email, String password)` – Verifica as credenciais do usuário e gera um token JWT.
- `register(User user)` – Registra um novo usuário no sistema.
- `validateToken(String token)` – Valida o token JWT.

**Filtros de Segurança:**
- O sistema usará um filtro JWT para proteger rotas sensíveis (como finalização de pedido).

---

## Casos de Uso

1. **Cadastro de Produtos**
   - Ator: Administrador
   - Descrição: O administrador pode adicionar, editar e remover produtos do catálogo.

2. **Visualização de Produtos**
   - Ator: Usuário
   - Descrição: Os usuários podem visualizar uma lista de produtos e filtrar por categoria.

3. **Gerenciamento do Carrinho de Compras**
   - Ator: Usuário
   - Descrição: Os usuários podem adicionar, remover e atualizar a quantidade de produtos no carrinho.

4. **Finalização de Pedido**
   - Ator: Usuário Autenticado
   - Descrição: O usuário pode finalizar um pedido, criando-o a partir dos itens no carrinho.

5. **Autenticação de Usuário**
   - Ator: Usuário
   - Descrição: O usuário pode se registrar ou fazer login para acessar o carrinho e finalizar pedidos.

---

## Considerações Finais

Este documento fornece uma visão clara e concisa do que deve ser implementado no sistema de e-commerce simples, com foco em boas práticas de segurança, escalabilidade e modularidade, permitindo uma fácil manutenção e futuras expansões.

