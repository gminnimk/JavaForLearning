package week02.homework;

import java.util.*;


public class homework {
    public static void main(String[] args) {

        // 입력값
        // 저장할 자료구조명을 입력합니다.(List/Set/Map)
        // 내가 좋아하는 요리 제목을 먼저 입력합니다.
        Scanner sc = new Scanner(System.in);
        String collectionName = sc.nextLine();
        String title = sc.nextLine();


        // 이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
        // 입력을 마쳤으면 마지막에 "끝" 문자를 입력합니다.

        switch (collectionName) {
            case "List":
                ArrayList<String> strList = new ArrayList();
                while (true) {
                    // 한 줄씩 입력받아서 strList에 저장되게끔!!
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strList.add(text);
                }


                // 출력값

                // 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
                // 이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.

                title = "[ List 로 저장된 " + title + "]";
                System.out.println(title);

                for (int i = 0; i < strList.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strList.get(i));
                }


                // Map 자료구조
            case "Map":
                Map<Integer, String> strMap = new HashMap();
                while (true) {
                    int linenumber = 1;
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(linenumber++, text);
                }


                // 출력값

                // 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
                // 이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.

                title = "[ Map 로 저장된 " + title + "]";
                System.out.println(title);

                for (int i = 0; i < strMap.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strMap.get(i + 1));
                }
                break;

            // Set 자료구조
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet();
                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strSet.add(text);
                }


                // 출력값

                // 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
                // 이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.

                title = "[ List 로 저장된 " + title + "]";
                System.out.println(title);
                Iterator iterator = strSet.iterator();
                for (int i = 0; i < strSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + iterator.next());
                }
                break;

            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }
    }
}





// if 문


//Scanner sc = new Scanner(System.in);
//String collectionName = sc.nextLine();
//String title = sc.nextLine();
//
//            if (Objects.equals(collectionName, "List")) {
//ArrayList<String> strList = new ArrayList<>();
//                while (true) {
//String text = sc.nextLine();
//                    if (Objects.equals(text, "끝")) {
//        break;
//        }
//        strList.add(text);
//                }
//
//title = "[ List로 저장된 " + title + " ]";
//        System.out.println(title);
//                for (int i = 0; i < strList.size(); i++) {
//int number = i + 1;
//                    System.out.println(number + ". " + strList.get(i));
//        }
//        } else if (Objects.equals(collectionName, "Set")) {
//LinkedHashSet<String> strSet = new LinkedHashSet<>();
//                while (true) {
//String text = sc.nextLine();
//                    if (Objects.equals(text, "끝")) {
//        break;
//        }
//        strSet.add(text);
//                }
//
//title = "[ Set 으로 저장된 " + title + " ]";
//        System.out.println(title);
//
//Iterator<String> iterator = strSet.iterator();
//int number = 1;
//                while (iterator.hasNext()) {
//        System.out.println(number + ". " + iterator.next());
//number++;
//        }
//        } else if (Objects.equals(collectionName, "Map")) {
//Map<Integer, String> strMap = new HashMap<>();
//int lineNumber = 1;
//                while (true) {
//String text = sc.nextLine();
//                    if (Objects.equals(text, "끝")) {
//        break;
//        }
//        strMap.put(lineNumber++, text);
//                }
//
//title = "[ Map 으로 저장된 " + title + " ]";
//        System.out.println(title);
//
//                for (int i = 1; i <= strMap.size(); i++) {
//        System.out.println(i + ". " + strMap.get(i));
//        }
//        } else {
//        System.out.println("저장할 수 없는 자료구조 입니다.");
//            }