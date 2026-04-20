class MinStack:

    def __init__(self):
        self.values = []
        self.minimum = []  
        return None  

    def push(self, val: int) -> None:
        self.values.append(val)
        if len(self.minimum) == 0:
            self.minimum.append(val)
        elif self.minimum[-1] > val:
            self.minimum.append(val)
        else:
            self.minimum.append(self.minimum[-1])

        return None

    def pop(self) -> None:
        self.values.pop()
        self.minimum.pop()
        return None

    def top(self) -> int:
        return self.values[-1]

    def getMin(self) -> int:
        return self.minimum[-1]
