# taking input from the user
input_string = input()
class turingmachine:
    def __init__(self):
        self.tape=[]
        self.head=0
        self.state=1
        self.count=0
        self.tape=[char for char in input_string]
        self.size=len(self.tape)
    #  current state of machine 
    def machine_state(self):
        print("Head Location :",self.head)
        print("Tape: ",self.tape)
    
    def back_state(self):
        print("it is in backstate");
        if(self.tape[self.head]== "#"):
            for i in range(int((self.size)/2)+1-self.count):
                self.head -=1
                self.machine_state()
            self.machine_state()
        else:
            self.head-=1
            self.machine_state()
            self.back_state()
    
    def fwd_state(self):
        print("it is in fwdstate")
        if(self.tape[self.head] =="#"):
            self.state+=1
            for i in range(self.count):
                self.head+=1
                self.machine_state()
            self.tape[self.head] ="x"
            self.machine_state()
            if(self.head !=self.zize-1):
                print("backward")
                self.back_state()
        else:
            self.head+=1
            self.machine_state()
            self.back_state()
    
    def run (self):
        print("Initial state")
        self.machine_state()
        a,b=list(input_string.split("#"))
        if(len(a)==len(b)):
            for i in range(int((self.size-1)/2)):
                # if the ith element of the array is 0 then enters the loop and places 0 zero with X until #
                if(a[i]=='0' and b[i]=='0'):
                    print("forward")
                    # increasing count varaible 
                    self.count==1
                    self.tape[i]="x"
                    self.fwd_state()
                    print("accepted")
                # if the condition is rejected breaking the loop without moving to other lines of code.
                else:
                    print("rejected")
                    break
        #  if none of the case is executed that means the given input is rejected.
        else:
            print("rejected")
machine= turingmachine()
machine.run()
