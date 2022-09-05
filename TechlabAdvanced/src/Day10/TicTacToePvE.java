package Day10;

import apcs.Window;
import java.util.Scanner;

public class TicTacToePvE {
	public static void main(String[] args) {
		createWindow();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a space:");
		int s = scanner.nextInt();
		print("O", s);
		if (s == 2) {
			print("X", 7);
			System.out.println("Pick a space:");
			int O = scanner.nextInt();
			print("O", O);
			if (O == 4) {
				print("X", 9);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if (Q == 5) {
					print("X", 8);
					win();
				} else if (Q == 8) {
					print("X", 5);
					win();
				} else if (Q != 5 || Q != 8) {
					print("X", 5);
					win();
				}
			} else {
				print("X", 4);
				win();
			}
		} else if (s == 3) {
			print("X", 9);
			System.out.println("Pick a space:");
			int O = scanner.nextInt();
			print("O", O);
			if (O == 5) {
				print("X", 7);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if (Q == 4) {
					print("X", 8);
					win();
				} else if (Q == 8) {
					print("X", 4);
					win();
				} else if (Q != 4 || Q != 8) {
					print("X", 4);
					win();
				}
			} else {
				print("X", 5);
				win();
			}
		} else if (s == 4) {
			print("X", 3);
			System.out.println("Pick a space:");
			int O = scanner.nextInt();
			print("O", O);
			if (O == 2) {
				print("X", 9);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if (Q == 5) {
					print("X", 6);
					win();
				} else if (Q == 6) {
					print("X", 5);
					win();
				} else if (Q != 5 || Q != 6) {
					print("X", 5);
					win();
				}
			} else {
				print("X", 2);
				win();
			}
		} else if (s == 5) {
			print("X",9);
			System.out.println("Pick a space:");
			int O = scanner.nextInt();
			print("O", O);
			if(O==3) {
				print("X",7);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if(Q==4) {
					print("X",8);
					win();
				}else if(Q==8) {
					print("X",4);
					win();
				}else if(Q!=8||Q!=7) {
					print("X",8);
					win();
				}
			}else if(O==7) {
				print("X",3);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if(Q==2) {
					print("X",6);
					win();
				}else if(Q==6) {
					print("X",2);
					win();
				}else if(Q!=2||Q!=6) {
					print("X",2);
					win();
				}
			}else if(O==2) {
				print("X",8);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if(Q==7) {
					print("X",3);
					System.out.println("Pick a space:");
					Q = scanner.nextInt();
					print("O", Q);
					if(Q==6) {
						print("X",4);
						tie();
					}else {
						print("X",6);
						win();
					}
				}else {
					print("X",7);
					win();
				}
			}else if(O==6) {
				print("X",4);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if(Q==7) {
					print("X",3);
					System.out.println("Pick a space:");
					Q = scanner.nextInt();
					print("O", Q);
					if(Q==2) {
						print("X",8);
						tie();
					}else {
						print("X",2);
						win();
					}
				}else {
					print("X",7);
					win();
				}

			}else if(O==8) {
				print("X",2);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if(Q==3) {
					print("X",7);
					System.out.println("Pick a space:");
					Q = scanner.nextInt();
					print("O", Q);
					if(Q==4) {
						print("X",6);
						tie();
					}else {
						print("X",4);
						win();
					}
				}else {
					print("X",3);
					win();
				}
			}else if(O==4) {
				print("X",6);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if(Q==3) {
					print("X",7);
					System.out.println("Pick a space:");
					Q = scanner.nextInt();
					print("O", Q);
					if(Q==8) {
						print("X",2);
						tie();
					}else {
						print("X",8);
						win();
					}
				}else {
					print("X",3);
					win();
				}
			}
		} else if (s == 6) {
			print("X", 3);
			System.out.println("Pick a space:");
			int O = scanner.nextInt();
			print("O", O);
			if (O == 2) {
				print("X", 7);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if (Q == 5) {
					print("X", 4);
					win();
				} else if (Q == 4) {
					print("X", 5);
					win();
				} else if (Q != 4 || Q != 5) {
					print("X", 5);
					win();
				}
			} else {
				print("X", 2);
				win();
			}
		} else if (s == 7) {
			print("X", 9);
			System.out.println("Pick a space:");
			int O = scanner.nextInt();
			print("O", O);
			if (O == 5) {
				print("X", 3);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if (Q == 2) {
					print("X", 6);
					win();
				} else if (Q == 6) {
					print("X", 2);
					win();
				} else if (Q != 2 || Q != 6) {
					print("X", 2);
					win();
				}
			} else {
				print("X", 5);
				win();
			}
		} else if (s == 8) {
			print("X", 7);
			System.out.println("Pick a space:");
			int O = scanner.nextInt();
			print("O", O);
			if (O == 4) {
				print("X", 3);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if (Q == 2) {
					print("X", 5);
					win();
				} else if (Q == 5) {
					print("X", 2);
					win();
				} else if (Q != 5 || Q != 2) {
					print("X", 5);
					win();
				}
			} else {
				print("X", 4);
				win();
			}
		} else if (s == 9) {
			print("X", 3);
			System.out.println("Pick a space:");
			int O = scanner.nextInt();
			print("O", O);
			if (O == 2) {
				print("X", 7);
				System.out.println("Pick a space:");
				int Q = scanner.nextInt();
				print("O", Q);
				if (Q == 4) {
					print("X", 5);
					win();
				} else if (Q == 5) {
					print("X", 4);
					win();
				} else if (Q != 4 || Q != 5) {
					print("X", 5);
					win();
				}
			} else {
				print("X", 2);
				win();
			}
		} 
	}
	private static void tie() {
		Window.sleep(800);
		Window.out.color("White");
		Window.out.rectangle(300, 280, 160, 100);
		Window.out.color("Black");
		Window.out.font("arial black", 50);
		Window.out.print("Tie", 260, 300);	
		Window.frame(800);
	}
	private static void win() {
		Window.sleep(800);
		Window.out.color("White");
		Window.out.rectangle(300, 280, 230, 100);
		Window.out.color("Black");
		Window.out.font("arial black", 50);
		Window.out.print("X Wins", 210, 300);	
		Window.frame(800);
	}
	private static void print(String player, int i) {
		if (i == 2) {
			Window.out.color("Light Pink");
			Window.out.rectangle(Window.width() * 3 / 6, Window.height() * 1 / 6, 100, 100);
			Window.out.color("Black");
			Window.out.font("arial black", 100);
			Window.out.print(player, (int) (Window.width() / 2.25), (int) (Window.height() / 4.5));
		} else if (i == 3) {
			Window.out.color("Light Pink");
			Window.out.rectangle((int) (Window.width() / 1.27 + 10), (int) (Window.height() / 4.5 - 20), 150, 150);
			Window.out.color("Black");
			Window.out.font("arial black", 100);
			Window.out.print(player, (int) (Window.width() / 1.27), (int) (Window.height() / 4.5));
		} else if (i == 4) {
			Window.out.color("Light Pink");
			Window.out.rectangle((int) (Window.width() / 8.5)+10, ((int) (Window.height() / 1.75) - 20), 100, 110);
			Window.out.color("Black");
			Window.out.font("arial black", 100);
			Window.out.print(player, (int) (Window.width() / 8.5), (int) (Window.height() / 1.75));
		} else if (i == 5) {
			Window.out.color("Light Pink");
			Window.out.rectangle((int) (Window.width() / 2), ((int) (Window.height() / 2)), 150, 150);
			Window.out.color("Black");
			Window.out.font("arial black", 100);
			Window.out.print(player, (int) (Window.width() / 2.25), (int) (Window.height() / 1.75));
		} else if (i == 6) {
			Window.out.color("Light Pink");
			Window.out.rectangle((int) (Window.width() * 5 / 6), ((int) (Window.height() / 2)), 100, 100);
			Window.out.color("Black");
			Window.out.font("arial black", 100);
			Window.out.print(player, (int) (Window.width() / 1.27), (int) (Window.height() / 1.75));
		} else if (i == 7) {
			Window.out.color("Light Pink");
			Window.out.rectangle((int) (Window.width() * 1 / 6), ((int) (Window.height() * 5 / 6)), 100, 100);
			Window.out.color("Black");
			Window.out.font("arial black", 100);
			Window.out.print(player, (int) (Window.width() / 8.5), (int) (Window.height() / 1.1));
		} else if (i == 8) {
			Window.out.color("Light Pink");
			Window.out.rectangle((int) (Window.width() * 1 / 2), ((int) (Window.height() * 5 / 6)), 100, 100);
			Window.out.color("Black");
			Window.out.font("arial black", 100);
			Window.out.print(player, (int) (Window.width() / 2.25), (int) (Window.height() / 1.1));
		} else if (i == 9) {
			Window.out.color("Light Pink");
			Window.out.rectangle((int) (Window.width() * 5 / 6), ((int) (Window.height() * 5 / 6)), 100, 100);
			Window.out.color("Black");
			Window.out.font("arial black", 100);
			Window.out.print(player, (int) (Window.width() / 1.27), (int) (Window.height() / 1.1));
		}
	}
	private static void createWindow() {
		Window.size(600, 600);
		Window.out.background("Light pink");
		Window.out.color("Black");
		Window.out.rectangle(Window.width() / 3, Window.height() / 2, 10, Window.height());
		Window.out.rectangle(Window.width() * 2 / 3, Window.height() / 2, 10, Window.height());
		Window.out.rectangle(Window.width() / 2, Window.height() / 3, Window.width(), 10);
		Window.out.rectangle(Window.width() / 2, Window.height() * 2 / 3, Window.width(), 10);
		Window.out.rectangle(0, 300, 20, 600);
		Window.out.rectangle(600, 300, 20, 600);
		Window.out.rectangle(300, 0, 600, 20);
		Window.out.rectangle(300, 600, 600, 20);
		Window.out.font("arial black", 100);
		Window.out.color("Black");
		Window.out.print("X", (int) (Window.width() / 8.5), (int) (Window.height() / 4.5));
		Window.out.color("White");
		Window.out.print("2", (int) (Window.width() / 2.25), (int) (Window.height() / 4.5));
		Window.out.print("3", (int) (Window.width() / 1.27), (int) (Window.height() / 4.5));
		Window.out.print("4", (int) (Window.width() / 8.5), (int) (Window.height() / 1.75));
		Window.out.print("5", (int) (Window.width() / 2.25), (int) (Window.height() / 1.75));
		Window.out.print("6", (int) (Window.width() / 1.27), (int) (Window.height() / 1.75));
		Window.out.print("7", (int) (Window.width() / 8.5), (int) (Window.height() / 1.1));
		Window.out.print("8", (int) (Window.width() / 2.25), (int) (Window.height() / 1.1));
		Window.out.print("9", (int) (Window.width() / 1.27), (int) (Window.height() / 1.1));
	}
}