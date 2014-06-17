tbc-ticket-dispenser-java
=========================

The Ticket Dispenser in Java is the 2nd of the 4 TDD with Mock Objects (see Luca Minudel's repo https://github.com/lucaminudel/TDDwithMockObjectsAndDesignPrinciples) katas in my book Taming the Bad Code with Katas.

本repo是我正在撰写的《操练驯服烂代码》一书中的用TDD驯服烂代码的4个mock操练例子中的第2个。这个例子的源代码来自ThoughtWorks Studio的培训师和教练Luca Minudel在两年前设计的编程操练系列题目TDD with Mock Objects。这个题目是自动取号系统，类似于去银行办事进门时取号的那种取号机。有3个类：TurnTicket类表示要取的票，保存着票上印着的号码；TurnNumberSequence类用于产生所有票上的号码；TicketDispenser根据从TurnNumberSequence类获得的号码来出票。操练要求为TicketDispenser类编写单元测试，而且要求在有多个取号机TicketDispenser的情况下，两个人分别在两台取号机上不能取到同样号码的票。最后在测试的保护下实现两个新功能：1）VIP客户的票号从1001开始；2）普通（Regular）客户的票号从2001开始。
