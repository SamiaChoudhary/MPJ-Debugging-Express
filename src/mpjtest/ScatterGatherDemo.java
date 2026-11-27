package mpjtest;
import mpi.*;
import java.util.Arrays;
public class ScatterGatherDemo{
	public static void main(String[] args) throws Exception {
		MPI.Init(args);
		int rank = MPI.COMM_WORLD.Rank();
		int size = MPI.COMM_WORLD.Size();
		int unitSize = 4;
		int root = 0;
		if (size != 4) {
			if (rank == 0) {
				System.out.println("Please run with exactly 4 processes (np = 4).");
            }
		}
	}
	}
}