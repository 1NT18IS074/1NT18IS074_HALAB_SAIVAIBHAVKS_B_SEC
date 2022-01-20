import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    home: Scaffold( // Scaffold houses appBar and body property
      appBar:AppBar(
        title: const Text(
            'Scaffold-SafeArea'
        ),
      ),
      body:const SafeArea( // Defining SafeArea as Child of Container
        child: Center(
          child: Text(
              'HI SAIVAIBHAV !!'
          ),
        ),
      ),
    ),
  ));
}
