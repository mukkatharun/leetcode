class MinStack:

    def __init__(self):
        self.q = []

    def push(self, val: int) -> None:
        currMin = self.getMin()
        if currMin == None or val < currMin:
            currMin = val
        self.q.append((val, currMin))
        print(self.q)

    def pop(self) -> None:
        if(len(self.q) != 0):
            self.q.pop()

    def top(self) -> int:
        if len(self.q) == 0:
            return None
        else:
            return self.q[-1][0]

    def getMin(self) -> int:
        if(len(self.q)  == 0):
            return None
        else:
            return self.q[-1][1]
