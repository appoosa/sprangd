'use strict';


var examApp = angular.module('ExamApp', []);

examApp.controller('QuestionController', function($scope,$http) {
  $http.get('/questions').success(function(questionList) {
    $scope.questions = questionList;
  });
});
