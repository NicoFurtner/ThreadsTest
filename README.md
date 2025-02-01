# ThreadsTest
PingPong Threads
Schreibe eine Klasse PingPongR und eine Klasse PingPongT. Beide Klassen sollen als Thread lauffähig sein und entweder "Ping" oder "Pong" (einstellbar über einen Konstruktor-Parameter) innerhalb dieses Threads auf dem Bildschirm ausgeben. Die Klasse PingPongR implementiert dazu das Interface Runnable, die Klasse PingPongT erbt von Thread. Beide Klassen müssen die Möglichkeit bieten, den Thread sauber wieder zu beenden.

Starte dann mit jeder Klasse 2 Threads, wobei je ein Thread mit Hilfe einer der obigen Klasse immer Ping ausgibt und der andere immer Pong. Warte dann 10s und beende dann alle laufenden Threads wieder.
