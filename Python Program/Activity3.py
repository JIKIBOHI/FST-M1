player1=input("Enter player1")
player2=input("Enter player2")


player1_ans=input(player1+"What do you want to choose rock,scissor,paper")
player2_ans=input(player1+"What do you want to choose rock,scissor,paper")

if(player1_ans==player2_ans):
    print("Its a tie")
elif player1_ans=="rock":
    if player2_ans=="scissors":
        print("Rock wins")
    else:
        print("Paper wins")
elif player1_ans=="scissors":
    if player2_ans=="rock":
        print("Scissors wins")
    else:
        print("Rock wins")
elif player1_ans=="paper":
    if player2_ans=="rock":
        print("Paper wins")
    else:
        print("Scissors wins")
else:
    print("Please enter a valid")

    