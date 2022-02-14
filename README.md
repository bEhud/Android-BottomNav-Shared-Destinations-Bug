# Android-BottomNav-Shared-Destinations-Bug
MVP for issue using BottomNavigation view with graphs that share destinations.

Navigation from fragment to fragment : Press the TextView in the middle of the fragment.

Graph nav_graph : 
With included graphs : nav_graph_home, nav_graph_profile
StartDestination : nav_graph_home

Graph nav_graph_home with :
Destinations : Home, Profile.
Actions : Home -> Profile
StartDestination : Home

Graph nav_graph_profile with :
Destinations : Home, Profile.
Actions : Profile -> Home
StartDestination : Profile

Bugs :
1# Menu items not updating :
1) Launching the app, Home selected on BottomNav.
2) Navigating from Home -> Profile.
3) Pressing BottomNav Profile item
BottomNav is still on item Home, should be Profile.

2# Crashing when navigating from Fragment to Fragment
1) Start with flow of bug 1#
2) Click on TextView, should navigate to Home.
   Boom, app crashes

