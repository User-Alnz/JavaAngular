package basics;

public class MultipleArray {

	public static void main(String[] args) {
		
		int MultiDimensionArray[][] = {
				{1, 1, 2},
				{2, 1, 1},
				{2, 2, 2},
		};
		
		int row = 0;
		int column = 0;
		int maxLength = MultiDimensionArray.length;

		while(row < maxLength)
		{
			column = 0;
			while(column < maxLength)
			{
				System.out.print(MultiDimensionArray[row][column]);
				column++;
			}
			System.out.print("\n");
			row++;
		}

	}

}
