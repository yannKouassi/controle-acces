Kouassi N'gouan Yannick L2 A 

# controle-acces
Rapport Final : Système de Contrôle d'Accès
Présentation des Spécifications Initiales
Le projet consiste à concevoir un système de contrôle d'accès pour un bâtiment sécurisé. Ce système doit utiliser des règles de logique formelle, des automates pour gérer les états, des circuits logiques pour la réalisation matérielle, et des méthodes formelles pour vérifier la conformité du système avec les spécifications.

Exigences Fonctionnelles
Vérification de la validité de la carte d'accès.

Vérification du code PIN associé à la carte.

Gestion des tentatives incorrectes et déclenchement d'une alarme après trois tentatives échouées.

Exigences Non Fonctionnelles
Fiabilité et robustesse du système.

Facilité d'utilisation pour les utilisateurs finaux.

Sécurité contre les tentatives d'accès non autorisées.

Description des Modèles d'Automates et des Circuits Logiques Réalisés
Modèles d'Automates
Un automate fini déterministe (AFD) a été créé pour modéliser le fonctionnement du système de contrôle d'accès. Les états de l'automate incluent :

ATTENTE_CARTE : Attente de l'insertion de la carte.

VERIFICATION_CODE : Vérification du code PIN.

ACCES_ACCORDE : Accès accordé après validation de la carte et du code PIN.

ACCES_REFUSE : Accès refusé après une tentative incorrecte.

ALARME : Alarme déclenchée après trois tentatives incorrectes.

Les transitions entre ces états sont définies par les règles logiques spécifiées, telles que "Si la carte est valide et le code est correct, alors accès accordé".

Circuits Logiques
Les règles logiques ont été implémentées sous forme de circuits logiques en utilisant l'algèbre de Boole. Les expressions logiques ont été simplifiées à l'aide des lois de l'algèbre de Boole et optimisées avec les cartes de Karnaugh. Les circuits logiques combinatoires ont été conçus pour réaliser les différentes fonctions du système de contrôle d'accès.

Résultats des Vérifications Formelles et des Optimisations
Vérifications Formelles
Des méthodes de model checking ont été appliquées pour vérifier automatiquement que l'automate respecte bien les règles de sécurité spécifiées. Des outils de vérification formelle tels que SPIN et Z3 ont été utilisés pour analyser les propriétés de sûreté et de sécurité du système. Les vérifications ont confirmé que le système répond aux exigences de sécurité et de fiabilité.

Optimisations
Les circuits logiques ont été optimisés pour minimiser le nombre de portes logiques nécessaires, ce qui améliore l'efficacité et réduit les coûts de réalisation matérielle. Les simulations ont validé le bon fonctionnement des circuits logiques.

Discussion des Défis Rencontrés et des Solutions Apportées
Défis
Complexité de la spécification des règles logiques.

Optimisation des circuits logiques pour minimiser les ressources matérielles.

Vérification formelle des propriétés de sécurité.

Solutions
Utilisation de méthodes formelles pour spécifier et vérifier les règles logiques.

Application des cartes de Karnaugh pour simplifier et optimiser les circuits logiques.

Utilisation d'outils de model checking pour vérifier automatiquement la conformité du système.

Conclusion sur l'Efficacité et la Fiabilité du Système Conçu
Le système de contrôle d'accès conçu est efficace et fiable, répondant aux exigences de sécurité et de performance. Les vérifications formelles ont confirmé que le système est robuste face à des scénarios d'attaque ou de défaillance. Les optimisations réalisées ont permis de concevoir un système performant et économique.


