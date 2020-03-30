package oj.uz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://oj.uz/problem/view/KRIII5_ABC
 */
public class KRIII5_ABC {

	private static Integer[] SOLVED = {1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031, 1032, 1033, 1034, 1035, 1036, 1037, 1038, 1039, 1040, 1041, 1042, 1043, 1044, 1045, 1046, 1047, 1049, 1050, 1051, 1052, 1053, 1054, 1055, 1056, 1057, 1058, 1059, 1060, 1061, 1062, 1063, 1064, 1065, 1066, 1067, 1069, 1071, 1072, 1073, 1074, 1075, 1076, 1078, 1080, 1081, 1082, 1083, 1084, 1085, 1086, 1088, 1089, 1090, 1092, 1094, 1095, 1097, 1099, 1100, 1102, 1103, 1104, 1105, 1106, 1108, 1109, 1110, 1112, 1114, 1115, 1117, 1119, 1120, 1121, 1124, 1126, 1128, 1129, 1131, 1132, 1135, 1136, 1137, 1138, 1139, 1140, 1141, 1143, 1144, 1145, 1146, 1149, 1150, 1152, 1153, 1155, 1157, 1158, 1159, 1166, 1167, 1168, 1173, 1176, 1177, 1181, 1182, 1184, 1185, 1187, 1188, 1189, 1193, 1197, 1198, 1199, 1200, 1201, 1203, 1204, 1205, 1206, 1208, 1209, 1212, 1213, 1215, 1222, 1225, 1229, 1233, 1234, 1235, 1236, 1237, 1238, 1239, 1240, 1241, 1242, 1243, 1246, 1247, 1248, 1251, 1252, 1253, 1254, 1255, 1259, 1260, 1261, 1262, 1265, 1267, 1268, 1269, 1270, 1273, 1275, 1279, 1280, 1282, 1283, 1285, 1289, 1291, 1292, 1294, 1296, 1297, 1298, 1300, 1301, 1302, 1303, 1305, 1306, 1309, 1312, 1315, 1316, 1321, 1322, 1323, 1325, 1326, 1328, 1330, 1331, 1337, 1339, 1341, 1342, 1343, 1344, 1345, 1347, 1350, 1351, 1354, 1356, 1357, 1358, 1359, 1365, 1371, 1373, 1376, 1377, 1381, 1388, 1389, 1390, 1392, 1394, 1396, 1398, 1399, 1402, 1404, 1405, 1406, 1407, 1408, 1410, 1412, 1413, 1415, 1416, 1417, 1418, 1421, 1422, 1423, 1424, 1427, 1430, 1431, 1432, 1435, 1436, 1437, 1439, 1440, 1441, 1442, 1444, 1446, 1448, 1449, 1450, 1453, 1455, 1456, 1457, 1459, 1462, 1463, 1464, 1469, 1470, 1475, 1476, 1477, 1480, 1484, 1485, 1488, 1491, 1492, 1495, 1500, 1501, 1502, 1504, 1505, 1506, 1507, 1508, 1509, 1510, 1512, 1513, 1515, 1516, 1517, 1519, 1520, 1521, 1522, 1523, 1524, 1526, 1527, 1528, 1529, 1530, 1531, 1535, 1538, 1540, 1541, 1543, 1544, 1545, 1546, 1547, 1548, 1550, 1551, 1554, 1555, 1557, 1560, 1561, 1562, 1563, 1565, 1566, 1568, 1569, 1570, 1572, 1577, 1581, 1582, 1587, 1588, 1590, 1591, 1592, 1593, 1595, 1598, 1599, 1600, 1603, 1604, 1605, 1607, 1612, 1613, 1614, 1615, 1620, 1622, 1629, 1630, 1633, 1637, 1638, 1639, 1643, 1644, 1645, 1646, 1647, 1652, 1654, 1655, 1656, 1657, 1660, 1662, 1664, 1668, 1669, 1670, 1671, 1672, 1673, 1676, 1677, 1679, 1681, 1684, 1687, 1689, 1690, 1691, 1692, 1695, 1697, 1699, 1701, 1704, 1707, 1708, 1709, 1712, 1713, 1715, 1718, 1720, 1722, 1725, 1727, 1729, 1730, 1731, 1732, 1735, 1737, 1740, 1743, 1744, 1748, 1749, 1750, 1752, 1753, 1755, 1756, 1757, 1759, 1761, 1763, 1764, 1766, 1767, 1769, 1773, 1777, 1780, 1781, 1782, 1785, 1786, 1787, 1788, 1789, 1790, 1792, 1793, 1797, 1799, 1801, 1802, 1805, 1806, 1807, 1810, 1812, 1813, 1816, 1817, 1818, 1821, 1822, 1833, 1834, 1835, 1836, 1838, 1839, 1843, 1847, 1849, 1850, 1855, 1863, 1865, 1871, 1874, 1889, 1890, 1895, 1898, 1900, 1904, 1908, 1911, 1912, 1913, 1914, 1915, 1916, 1919, 1920, 1922, 1924, 1925, 1926, 1927, 1929, 1930, 1931, 1932, 1933, 1934, 1935, 1937, 1939, 1940, 1941, 1942, 1943, 1945, 1946, 1947, 1948, 1949, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1963, 1964, 1965, 1966, 1967, 1969, 1972, 1975, 1976, 1977, 1978, 1980, 1981, 1987, 1989, 1990, 1991, 1992, 1995, 1996, 1999, 2002, 2003, 2004, 2005, 2007, 2008, 2010, 2011, 2012, 2014, 2015, 2018, 2021, 2022, 2023, 2024, 2033, 2034, 2036, 2037, 2038, 2040, 2042, 2043, 2045, 2052, 2056, 2057, 2063, 2066, 2069, 2072, 2073, 2075, 2078, 2079, 2082, 2086, 2087, 2088, 2089, 2090, 2092, 2096, 2097, 2098, 2099, 2101, 2103, 2104, 2108, 2109, 2110, 2112, 2115, 2117, 2118, 2123, 2124, 2126, 2128, 2133, 2135, 2136, 2138, 2141, 2142, 2143, 2145, 2150, 2153, 2154, 2155, 2156, 2157, 2159, 2160, 2161, 2162, 2163, 2164, 2166, 2167, 2168, 2169, 2170, 2171, 2175, 2176, 2178, 2180, 2183, 2184, 2185, 2186, 2188, 2190, 2192, 2193, 2194, 2195, 2196, 2197, 2200, 2201, 2205, 2206, 2207, 2208, 2210, 2211, 2212, 2216, 2217, 2218, 2220, 2224, 2225, 2226, 2228, 2229, 2230, 2231, 2232, 2233, 2234, 2237, 2239, 2240, 2242, 2243, 2246, 2247, 2248, 2250, 2252, 2253, 2257, 2258, 2259, 2261, 2262, 2266, 2268, 2270, 2272, 2281, 2285, 2290, 2291, 2292, 2293, 2294, 2295, 2296, 2300, 2301, 2302, 2303, 2304, 2305, 2309, 2312, 2313, 2315, 2316, 2320, 2322, 2327, 2331, 2336, 2338, 2342, 2344, 2346, 2349, 2352, 2355, 2357, 2358, 2364, 2366, 2369, 2370, 2373, 2376, 2381, 2385, 2388, 2392, 2394, 2395, 2399, 2401, 2405, 2407, 2410, 2413, 2415, 2417, 2418, 2419, 2420, 2421, 2422, 2423, 2424, 2426, 2428, 2431, 2433, 2435, 2436, 2437, 2438, 2439, 2440, 2441, 2442, 2443, 2444, 2445, 2446, 2447, 2448, 2455, 2456, 2458, 2460, 2461, 2463, 2464, 2465, 2467, 2468, 2470, 2473, 2475, 2476, 2477, 2480, 2482, 2484, 2485, 2487, 2490, 2491, 2492, 2493, 2495, 2496, 2500, 2501, 2502, 2503, 2504, 2505, 2506, 2508, 2511, 2512, 2514, 2515, 2517, 2520, 2521, 2522, 2523, 2525, 2526, 2527, 2529, 2530, 2531, 2532, 2533, 2535, 2541, 2546, 2547, 2548, 2551, 2552, 2553, 2555, 2556, 2557, 2558, 2559, 2560, 2562, 2563, 2565, 2566, 2567, 2568, 2573, 2576, 2577, 2578, 2579, 2580, 2581, 2583, 2584, 2587, 2588, 2589, 2591, 2592, 2594, 2596, 2597, 2600, 2605, 2606, 2607, 2608, 2609, 2612, 2615, 2622, 2623, 2628, 2630, 2631, 2632, 2636, 2638, 2643, 2644, 2658, 2659, 2660, 2661, 2665, 2666, 2667, 2668, 2669, 2670, 2671, 2673, 2675, 2676, 2681, 2682, 2684, 2685, 2688, 2693, 2696, 2697, 2698, 2702, 2703, 2704, 2705, 2708, 2711, 2712, 2715, 2716, 2718, 2720, 2721, 2725, 2728, 2729, 2731, 2734, 2737, 2738, 2739, 2740, 2741, 2742, 2743, 2744, 2745, 2747, 2748, 2749, 2750, 2751, 2752, 2753, 2754, 2755, 2757, 2764, 2766, 2774, 2775, 2776, 2777, 2778, 2779, 2780, 2781, 2783, 2784, 2786, 2787, 2788, 2789, 2790, 2793, 2794, 2798, 2799, 2800, 2803, 2804, 2805, 2810, 2811, 2812, 2815, 2816, 2818, 2819, 2820, 2821, 2822, 2823, 2824, 2825, 2828, 2829, 2830, 2832, 2836, 2839, 2840, 2841, 2844, 2845, 2846, 2847, 2849, 2850, 2851, 2852, 2853, 2854, 2855, 2857, 2858, 2862, 2863, 2864, 2865, 2867, 2869, 2870, 2875, 2877, 2878, 2879, 2884, 2885, 2887, 2890, 2892, 2893, 2894, 2895, 2896, 2897, 2898, 2899, 2900, 2901, 2902, 2903, 2905, 2906, 2908, 2909, 2910, 2912, 2914, 2916, 2920, 2921, 2923, 2924, 2935, 2938, 2941, 2942, 2943, 2947, 2948, 2949, 2952, 2953, 2954, 2957, 2959, 2960, 2961, 2963, 2965, 2966, 2974, 2977, 2978, 2979, 2981, 2985, 2986, 2987, 2988, 2989, 2990, 2991, 2992, 2993, 2997, 2998, 2999, 3000, 3001, 3003, 3004, 3005, 3006, 3007, 3009, 3011, 3012, 3013, 3015, 3019, 3020, 3021, 3022, 3023, 3024, 3026, 3028, 3029, 3033, 3034, 3035, 3036, 3037, 3038, 3039, 3040, 3041, 3045, 3046, 3047, 3049, 3052, 3053, 3054, 3056, 3058, 3059, 3060, 3061, 3062, 3063, 3066, 3067, 3071, 3076, 3077, 3078, 3079, 3080, 3081, 3085, 3086, 3098, 3100, 3101, 3106, 3107, 3108, 3110, 3120, 3121, 3123, 3124, 3125, 3126, 3127, 3128, 3129, 3131, 3133, 3135, 3136, 3158, 3163, 3164, 3165, 3167, 3174, 3178, 3208, 3213, 3216, 3221, 3226, 3257, 3273, 3295, 3300, 3321, 3323, 3343, 3344, 3345, 3351, 3356, 3360, 3366, 3405, 3406, 3407, 3408, 3412, 3414, 3419, 3428, 3442, 3447, 3449, 3460, 3462, 3495, 3498, 3526, 3568, 3595, 3613, 3614, 3621, 3622, 3640, 3644, 3645, 3650, 3652, 3653, 3654, 3660, 3665, 3666, 3673, 3679, 3681, 3684, 3687, 3691, 3693, 3699, 3711, 3726, 3745, 3747, 3752, 3758, 3778, 3806, 3807, 3825, 3826, 3827, 3828, 3829, 3830, 3831, 3833, 3841, 3845, 3850, 3863, 3875, 3876, 3885, 3896, 3903, 3908, 3914, 3925, 3930, 3943, 3944, 3945, 3946, 3948, 3952, 3955, 3964, 3967, 3981, 3985, 3986, 3987, 3988, 3989, 3990, 3991, 3995, 3996, 3997, 3999, 4002, 4008, 4016, 4017, 4030, 4083, 4084, 4092, 4095, 4097, 4101, 4105, 4110, 4134, 4153, 4158, 4159, 4206, 4211, 4217, 4218, 4222, 4223, 4225, 4233, 4237, 4243, 4256, 4257, 4299, 4307, 4312, 4315, 4320, 4328, 4342, 4343, 4344, 4348, 4354, 4355, 4370, 4375, 4388, 4435, 4446, 4457, 4458, 4461, 4470, 4493, 4504, 4539, 4563, 4564, 4574, 4597, 4606, 4620, 4626, 4645, 4673, 4690, 4706, 4716, 4740, 4766, 4779, 4781, 4782, 4792, 4796, 4800, 4803, 4806, 4811, 4839, 4841, 4843, 4848, 4880, 4881, 4882, 4883, 4884, 4885, 4889, 4892, 4913, 4921, 4924, 4948, 4963, 4994, 4995, 4998, 4999, 5000, 5002, 5005, 5009, 5013, 5014, 5015, 5021, 5025, 5026, 5032, 5037, 5042, 5043, 5046, 5051, 5052, 5053, 5054, 5060, 5063, 5086, 5107, 5176, 5211, 5212, 5213, 5214, 5215, 5217, 5218, 5337, 5338, 5339, 5347, 5354, 5355, 5361, 5363, 5371, 5372, 5373, 5376, 5386, 5393, 5394, 5404, 5405, 5419, 5425, 5426, 5430, 5431, 5433, 5480, 5522, 5523, 5524, 5525, 5527, 5530, 5532, 5533, 5536, 5538, 5543, 5544, 5545, 5546, 5552, 5553, 5554, 5555, 5556, 5559, 5565, 5567, 5573, 5576, 5582, 5585, 5586, 5588, 5596, 5597, 5598, 5612, 5613, 5616, 5618, 5619, 5622, 5623, 5624, 5625, 5626, 5631, 5635, 5636, 5637, 5647, 5656, 5666, 5671, 5675, 5676, 5679, 5681, 5691, 5692, 5698, 5704, 5710, 5717, 5719, 5720, 5721, 5724, 5729, 5782, 5789, 5800, 5813, 5814, 5815, 5817, 5818, 5819, 5820, 5821, 5822, 5823, 5859, 5870, 5876, 5884, 5893, 5903, 5904, 5914, 5920, 5923, 5949, 5988, 6064, 6087, 6092, 6131, 6143, 6147, 6148, 6165, 6219, 6240, 6246, 6321, 6322, 6359, 6376, 6378, 6426, 6443, 6498, 6500, 6502, 6503, 6504, 6505, 6506, 6510, 6511, 6523, 6549, 6566, 6588, 6590, 6591, 6597, 6600, 6603, 6662, 6679, 6757, 6850, 6986, 6996, 7140, 7141, 7142, 7143, 7144, 7145, 7146, 7147, 7287, 7349, 7354, 7424, 7432, 7453, 7469, 7476, 7481, 7482, 7483, 7487, 7489, 7490, 7510, 7516, 7523, 7562, 7567, 7568, 7569, 7570, 7571, 7572, 7573, 7574, 7575, 7576, 7578, 7579, 7611, 7613, 7627, 7662, 7685, 7722, 7723, 7737, 7770, 7771, 7774, 7787, 7795, 7806, 7812, 7868, 7869, 7881, 7889, 7890, 7894, 7936, 7967, 7975, 7976, 7977, 7982, 7983, 7984, 7995, 7997, 7998, 8004, 8008, 8010, 8064, 8071, 8072, 8073, 8084, 8093, 8094, 8095, 8096, 8103, 8104, 8108, 8109, 8146, 8170, 8217, 8284, 8320, 8322, 8330, 8393, 8394, 8462, 8467, 8477, 8478, 8595, 8741, 8872, 8877, 8882, 8891, 8892, 8893, 8895, 8901, 8902, 8903, 8907, 8911, 8916, 8922, 8925, 8926, 8932, 8933, 8944, 8949, 8958, 8974, 8975, 8976, 8977, 8978, 8979, 8981, 8984, 8986, 8992, 9006, 9007, 9008, 9009, 9010, 9011, 9012, 9013, 9014, 9015, 9019, 9020, 9021, 9029, 9037, 9046, 9047, 9076, 9078, 9079, 9081, 9084, 9085, 9086, 9093, 9094, 9095, 9177, 9184, 9196, 9204, 9205, 9206, 9207, 9210, 9211, 9212, 9213, 9233, 9237, 9238, 9239, 9240, 9242, 9243, 9246, 9248, 9249, 9250, 9251, 9252, 9272, 9273, 9274, 9275, 9276, 9278, 9279, 9280, 9295, 9316, 9318, 9319, 9320, 9321, 9322, 9323, 9324, 9325, 9326, 9327, 9328, 9329, 9335, 9339, 9341, 9343, 9347, 9358, 9359, 9363, 9367, 9368, 9369, 9370, 9371, 9372, 9373, 9374, 9375, 9417, 9421, 9426, 9435, 9436, 9437, 9438, 9439, 9440, 9441, 9442, 9443, 9447, 9455, 9457, 9460, 9461, 9463, 9465, 9466, 9468, 9469, 9470, 9471, 9472, 9475, 9478, 9479, 9481, 9486, 9488, 9490, 9492, 9493, 9494, 9497, 9498, 9501, 9506, 9507, 9509, 9514, 9515, 9516, 9517, 9518, 9519, 9520, 9521, 9522, 9527, 9529, 9535, 9536, 9537, 9540, 9543, 9544, 9545, 9546, 9550, 9553, 9556, 9575, 9576, 9584, 9586, 9592, 9594, 9596, 9598, 9601, 9602, 9610, 9613, 9614, 9616, 9619, 9623, 9625, 9626, 9627, 9629, 9644, 9649, 9653, 9654, 9655, 9656, 9657, 9658, 9659, 9660, 9661, 9662, 9663, 9664, 9693, 9713, 9720, 9725, 9731, 9753, 9763, 9764, 9866, 9867, 9868, 9869, 9870, 9871, 9872, 9873, 9874, 9933, 9934, 9935, 9936, 9937, 9938, 9945, 9946, 9987, 9992, 9995, 9996, 9997, 9999, 10000, 10001, 10014, 10022, 10026, 10039, 10040, 10041, 10042, 10045, 10046, 10047, 10048, 10053, 10056, 10093, 10097, 10101, 10102, 10103, 10121, 10122, 10124, 10126, 10131, 10156, 10157, 10158, 10159, 10160, 10162, 10163, 10164, 10166, 10167, 10170, 10171, 10172, 10173, 10178, 10179, 10182, 10205, 10211, 10212, 10213, 10214, 10215, 10216, 10217, 10219, 10220, 10221, 10222, 10223, 10227, 10244, 10250, 10251, 10252, 10253, 10256, 10258, 10259, 10261, 10262, 10263, 10265, 10266, 10267, 10270, 10311, 10312, 10315, 10321, 10329, 10330, 10337, 10341, 10342, 10343, 10345, 10346, 10347, 10348, 10349, 10350, 10351, 10353, 10354, 10356, 10357, 10363, 10366, 10369, 10370, 10386, 10407, 10419, 10420, 10422, 10425, 10430, 10431, 10432, 10434, 10435, 10448, 10451, 10453, 10454, 10464, 10472, 10474, 10499, 10504, 10509, 10510, 10513, 10520, 10521, 10522, 10523, 10525, 10526, 10527, 10528, 10539, 10540, 10551, 10552, 10553, 10554, 10555, 10556, 10560, 10565, 10569, 10570, 10597, 10599, 10600, 10610, 10612, 10615, 10623, 10624, 10625, 10630, 10634, 10637, 10639, 10641, 10643, 10644, 10645, 10659, 10661, 10663, 10664, 10672, 10685, 10687, 10688, 10699, 10701, 10702, 10703, 10704, 10705, 10706, 10707, 10708, 10709, 10711, 10713, 10714, 10715, 10716, 10717, 10718, 10720, 10721, 10722, 10725, 10726, 10727, 10729, 10730, 10731, 10733, 10734, 10735, 10737, 10740, 10742, 10753, 10754, 10756, 10757, 10759, 10767, 10768, 10769, 10772, 10773, 10787, 10791, 10793, 10797, 10798, 10799, 10801, 10803, 10804, 10807, 10808, 10809, 10810, 10811, 10812, 10813, 10814, 10815, 10816, 10817, 10818, 10819, 10820, 10821, 10822, 10823, 10824, 10826, 10828, 10829, 10830, 10833, 10835, 10843, 10844, 10845, 10846, 10847, 10848, 10864, 10865, 10866, 10867, 10868, 10869, 10870, 10871, 10872, 10874, 10877, 10878, 10881, 10883, 10885, 10886, 10887, 10888, 10889, 10890, 10891, 10892, 10893, 10894, 10895, 10896, 10897, 10898, 10899, 10900, 10901, 10903, 10905, 10906, 10907, 10908, 10909, 10910, 10911, 10912, 10913, 10914, 10915, 10916, 10917, 10918, 10926, 10927, 10928, 10929, 10930, 10931, 10932, 10933, 10934, 10935, 10936, 10938, 10939, 10940, 10941, 10942, 10943, 10945, 10946, 10949, 10950, 10951, 10952, 10953, 10954, 10958, 10971, 10972, 10973, 10974, 10976, 10977, 10978, 10979, 10980, 10981, 10982, 10983, 10984, 10985, 10986, 10987, 10988, 10989, 10990, 10991, 10992, 10993, 10994, 10995, 10996, 10997, 10998, 11002, 11004, 11005, 11006, 11007, 11008, 11009, 11010, 11011, 11012, 11013, 11021, 11022, 11023, 11024, 11025, 11028, 11030, 11034, 11042, 11046, 11047, 11048, 11050, 11051, 11052, 11053, 11054, 11055, 11057, 11058, 11059, 11060, 11066, 11068, 11080, 11082, 11084, 11085, 11086, 11087, 11088, 11089, 11090, 11091, 11092, 11093, 11094, 11095, 11096, 11098, 11099, 11100, 11101, 11102, 11103, 11104, 11105, 11106, 11107, 11108, 11109, 11111, 11112, 11113, 11115, 11116, 11117, 11118, 11119, 11120, 11121, 11123, 11125, 11126, 11128, 11131, 11133, 11134, 11136, 11179, 11180, 11181, 11182, 11183, 11184, 11185, 11186, 11187, 11188, 11189, 11190, 11191, 11192, 11193, 11194, 11249, 11250, 11269, 11277, 11279, 11292, 11312, 11320, 11365, 11382, 11383, 11384, 11385, 11386, 11387, 11388, 11389, 11390, 11391, 11392, 11393, 11394, 11395, 11396, 11397, 11398, 11399, 11401, 11402, 11403, 11414, 11437, 11438, 11439, 11441, 11442, 11478, 11479, 11497, 11501, 11502, 11506, 11522, 11526, 11549, 11557, 11558, 11561, 11562, 11564, 11565, 11566, 11567, 11568, 11570, 11571, 11572, 11573, 11574, 11575, 11576, 11577, 11583, 11584, 11586, 11614, 11616, 11648, 11650, 11651, 11653, 11654, 11655, 11656, 11659, 11660, 11663, 11664, 11665, 11690, 11692, 11693, 11695, 11706, 11711, 11717, 11718, 11719, 11720, 11721, 11722, 11723, 11724, 11725, 11726, 11727, 11728, 11729, 11747, 11751, 11755, 11758, 11776, 11784, 11785, 11787, 11788, 11790, 11791, 11792, 11795, 11845, 11869, 11873, 11877, 11880, 11881, 11882, 11883, 11884, 11895, 11896, 11899, 11900, 11904, 11905, 11906, 11908, 11909, 11910, 11912, 11913, 11914, 11916, 11917, 11918, 11920, 11928, 11929, 11930, 11931, 11936, 11937, 11938, 11939, 11940, 11941, 11942, 11943, 11944, 11945, 11948, 11949, 11950, 11951, 11952, 11953, 11962, 11966, 11993, 12008, 12016, 12087, 12088, 12089, 12090, 12091, 12092, 12093, 12094, 12095, 12096, 12097, 12098, 12099, 12100, 12104, 12105, 12106, 12117, 12118, 12121, 12122, 12182, 12183, 12184, 12185, 12186, 12187, 12188, 12189, 12190, 12191, 12192, 12193, 12194, 12196, 12197, 12198, 12199, 12200, 12201, 12202, 12203, 12204, 12205, 12415, 12417, 12418, 12735, 12736, 12739, 12740, 12741, 12744, 12745, 12746, 12747, 12748, 12771, 12780, 12782, 12788, 12790, 12791, 12794, 12796, 12797, 12798, 12803, 12804, 12805, 12806, 12808, 12809, 12810, 12811, 12812, 12813, 12833, 12834, 12835, 12836, 12837, 12840, 12841, 12842, 12843, 12844, 12845, 12846, 12847, 12848, 12849, 12850, 12851, 12852, 12939, 12968, 13023, 13073, 13091, 13092, 13116, 13118, 13120, 13122, 13123, 13125, 13129, 13130, 13132, 13133, 13134, 13135, 13136, 13137, 13139, 13140, 13141, 13143, 13144, 13155, 13169, 13171, 13172, 13173, 13174, 13175, 13176, 13177, 13178, 13179, 13180, 13181, 13182, 13183, 13184, 13185, 13186, 13187, 13199, 13210, 13235, 13236, 13241, 13245, 13278, 13297, 13301, 13309, 13311, 13312, 13313, 13314, 13315, 13316, 13317, 13318, 13319, 13322, 13323, 13326, 13327, 13329, 13331, 13332, 13358, 13410, 13413, 13414, 13415, 13416, 13417, 13418, 13419, 13420, 13421, 13422, 13423, 13424, 13432, 13438, 13458, 13487, 13489, 13506, 13532, 13542, 13557, 13559, 13571, 13572, 13576, 13699, 13713, 13729, 13752, 13759, 13771, 13866, 13900, 13901, 13902, 13903, 13904, 13905, 13906, 13907, 13908, 13909, 13910, 13911, 13912, 13970, 13974, 14200, 14219, 14264, 14340, 14341, 14342, 14343, 14405, 14417, 14429, 14430, 14431, 14432, 14433, 14434, 14435, 14437, 14442, 14443, 14470, 14489, 14490, 14491, 14501, 14504, 14505, 14515, 14517, 14521, 14522, 14551, 14552, 14553, 14554, 14555, 14556, 14557, 14559, 14568, 14569, 14570, 14571, 14572, 14573, 14574, 14575, 14576, 14577, 14578, 14581, 14582, 14583, 14584, 14585, 14586, 14587, 14588, 14590, 14591, 14606, 14607, 14614, 14623, 14645, 14650, 14651, 14652, 14657, 14681, 14682, 14688, 14693, 14698, 14699, 14700, 14701, 14702, 14705, 14706, 14707, 14708, 14709, 14710, 14711, 14712, 14713, 14714, 14715, 14716, 14717, 14718, 14719, 14720, 14721, 14722, 14723, 14724, 14725, 14730, 14741, 14745, 14746, 14747, 14748, 14749, 14750, 14751, 14752, 14753, 14754, 14755, 14756, 14782, 14801, 14802, 14827, 14828, 14859, 14861, 14862, 14867, 14868, 14869, 14870, 14883, 14885, 14909, 14910, 14915, 14916, 14918, 14920, 14924, 14928, 14951, 14952, 14953, 14954, 14955, 14956, 14957, 14958, 14959, 14960, 14961, 14962, 15000, 15030, 15048, 15098, 15178, 15232, 15236, 15272, 15292, 15305, 15306, 15352, 15439, 15474, 15489, 15490, 15491, 15493, 15501, 15502, 15503, 15505, 15507, 15508, 15509, 15510, 15511, 15512, 15513, 15514, 15515, 15516, 15517, 15549, 15552, 15556, 15557, 15560, 15561, 15562, 15563, 15564, 15565, 15569, 15570, 15571, 15572, 15573, 15574, 15575, 15596, 15610, 15624, 15629, 15631, 15632, 15633, 15637, 15638, 15640, 15641, 15651, 15667, 15668, 15669, 15670, 15671, 15672, 15673, 15674, 15675, 15677, 15678, 15679, 15680, 15688, 15700, 15708, 15709, 15710, 15711, 15712, 15713, 15714, 15715, 15717, 15718, 15727, 15733, 15734, 15735, 15736, 15766, 15767, 15768, 15769, 15770, 15771, 15772, 15773, 15775, 15776, 15777, 15779, 15780, 15781, 15802, 15813, 15819, 15829, 15873, 15879, 15881, 15886, 15890, 15891, 15892, 15893, 15894, 15908, 15913, 15921, 15953, 15954, 15955, 15956, 15957, 15958, 15962, 15963, 15964, 15965, 15966, 15967, 15968, 15969, 15975, 15979, 15980, 15981, 15982, 15983, 15984, 15986, 15987, 15996, 16076, 16118, 16120, 16121, 16122, 16123, 16128, 16129, 16138, 16139, 16140, 16141, 16142, 16143, 16151, 16152, 16153, 16154, 16155, 16156, 16157, 16158, 16159, 16160, 16161, 16162, 16164, 16165, 16166, 16167, 16168, 16169, 16170, 16171, 16172, 16173, 16174, 16181, 16182, 16184, 16186, 16187, 16189, 16191, 16204, 16208, 16209, 16210, 16211, 16212, 16213, 16214, 16218, 16219, 16221, 16222, 16234, 16334, 16394, 16395, 16409, 16430, 16431, 16432, 16433, 16435, 16440, 16456, 16486, 16494, 16561, 16647, 16673, 16676, 16679, 16681, 16684, 16685, 16712, 16713, 16714, 16715, 16742, 16745, 16777, 16783, 16792, 16856, 16941, 16972, 16980, 16981, 16982, 16983, 16987, 16988, 16989, 16992, 17008, 17079, 17081, 17106, 17110, 17113, 17114, 17115, 17117, 17118, 17119, 17127, 17128, 17129, 17130, 17131, 17132, 17133, 17136, 17140, 17166, 17167, 17169, 17170, 17171, 17306, 17307, 17360, 17370, 17371, 17372, 17375, 17376, 17378, 17380, 17385, 17388, 17389, 17390, 17391, 17392, 17393, 17394, 17395, 17396, 17397, 17398, 17399, 17400, 17401, 17402, 17403, 17405, 17407, 17426, 17428, 17448, 17450, 17451, 17452, 17453, 17454, 17457, 17460, 17466, 17467, 17468, 17506, 17510, 17513, 17515, 17518, 17672, 17674, 17675, 17677, 17682, 17739, 18015, 18016, 18017, 18122, 18137, 18185, 18186, 18191, 18192, 18193, 18194, 18195, 18197, 18342, 18343, 18344, 18345, 18346, 18347, 18348, 18349, 18350, 18351, 18372, 18373, 18374, 18375, 18376, 18377, 18378, 18379, 18380, 18381, 18776, 18789, 18790, 18791, 18792, 18801};
	private static Integer[] FAILED = {1048, 1068, 1098, 1196, 1219, 1232, 1274, 1353, 1387, 1445, 1489, 1494, 1511, 1564, 1601, 1641, 1696, 1717, 1741, 1747, 1783, 1800, 1840, 1869, 1884, 1909, 2051, 2076, 2091, 2122, 2130, 2137, 2255, 2264, 2277, 2343, 2365, 2427, 2509, 2516, 2561, 2590, 2618, 2624, 2694, 2886, 2907, 3025, 3042, 3083, 3111, 3144, 3411, 3584, 3623, 3641, 3682, 3696, 3724, 3790, 3832, 3970, 4026, 4027, 4072, 4082, 4366, 4373, 4382, 4407, 4496, 4524, 4565, 4703, 4807, 4886, 4950, 4973, 5008, 5055, 5203, 5249, 5570, 5615, 5628, 5639, 5646, 5705, 5771, 5856, 5857, 5892, 5898, 5950, 6068, 6090, 6124, 6134, 6354, 6444, 6490, 6550, 6562, 6589, 6608, 6705, 6737, 6820, 6988, 7021, 7286, 7334, 7484, 7503, 7540, 7623, 7785, 7981, 8009, 8081, 8125, 8452, 8873, 8890, 9017, 9236, 9244, 9376, 9499, 9630, 9676, 9878, 9957, 9986, 10088, 10240, 10245, 10264, 10269, 10316, 10436, 10475, 10506, 10638, 10656, 10670, 10800, 10825, 10875, 10944, 10947, 10999, 11110, 11122, 11124, 11135, 11338, 11404, 11410, 11496, 11545, 11569, 11636, 11816, 11839, 11872, 11988, 12195, 12416, 12507, 12523, 12673, 13058, 13062, 13165, 13166, 13243, 13324, 13388, 13480, 13544, 13629, 13680, 13695, 13786, 13865, 13938, 13988, 14128, 14216, 14444, 14558, 14589, 15492, 15504, 15506, 15566, 15567, 15568, 15642, 15643, 15911, 15985, 16125, 16144, 16711, 16916, 17107, 17108, 17303, 17441};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] rst = new String[N];

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (Arrays.binarySearch(FAILED, x) > -1) {
				rst[i] = "H";
			} else if (Arrays.binarySearch(SOLVED, x) > -1) {
				rst[i] = "E";
			} else {
				rst[i] = "VH";
			}
		}

		for (String s : rst) {
			System.out.println(s);
		}
	}
}