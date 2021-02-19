


create database sireesh;
use sireesh;
create table logbook(userid int REFERENCES user(userid), timestamp TIMESTAMP, IP VARCHAR(15));
create table iit(first_name varchar(30),last_name varchar(30),user_name varchar(20),email varchar(30),password varchar(20),cpassword varchar(20),apt_test varchar(30),level varchar(2));
create table math_q1_a (sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));
insert into math_q1_a values(01,"If the 2nd, 5th and 9th terms of a non-constant A.P. are in G.P., then the common ratio of this G.P. is :","8/5","4/3","1","7/4","b",null,"A.P & G.P SERIES");
insert into math_q1_a values(02,"If all the words (with or without meaning) having five letters, formed using the letters of the word SMALL and arranged as in a dictionary; then the position of the word SMALL is :","46TH","59TH","52ND","58TH","d",null,"probability");
insert into math_q1_a values(03,"A wire of length 2 units is cut into two parts which are bent respectively to form a square of side=x units and a circle of radius=r units. If the sum of the areas of the square and the circle so formed is minimum, then :","2x=((22/7)+4)r","(4-(22/7))x=(22/7)r","x=2r","2x=r","c",null,"mensuration based");
insert into math_q1_a values(04,"Two sides of a rhombus are along the lines, x-y+1=0 and 7x-y-5=0. If its diagonals intersect at (-1, -2), then which one of the following is a vertex of this rhombus ?","(-3,-9)","(-3,-8)","(1/3,-8/3)","(-10/3,-7/3)","c",null,"geometry based");
insert into math_q1_a values(05,"The centres of those circles which touch the circle, x2+y2-8X-8Y-4=0, externally and also touch the x-axis, lie on :","a circle.","an ellipse which is not a circle.","a hyperbola.","a parabola.","d",null,"conic sections");
insert into math_q1_a values(06,"If the standard deviation of the numbers 2, 3, a and 11 is 3.5, then which of the following is true ?","3a2-26A+55=0","3a2-32A+84=0","3a2-34A+91=0","3a2-23A+44=0","b",null,"statistics");
insert into math_q1_a values(07,"Let two fair six-faced dice A and B be thrown simultaneously. If E1 is the event that die A shows up four, E2 is the event that die B shows up two and E3 is the event that the sum of numbers on both dice is odd, then which of the following statements is NOT true ?","E1 and E2 are independent.","E2 and E3 are independent.","E1 and E3 are independent.","E1,E2 and E3 are independent.","d",null,"probability");
insert into math_q1_a values(08,"If 0=x<2p, then the number of real values of x, which satisfy the equation cosx+cos2x+cos3x+cos4x=0, is :","3","5","7","9","c",null,"trigonometry");
insert into math_q1_a values(09,"A man is walking towards a vertical pillar in a straight path, at a uniform speed. At a certain point A on the path, he observes that the angle of elevation of the top of the pillar is 308. After walking for 10 minutes from A in the same direction, at a point B, he observes that the angle of elevation of the top of the pillar is 608. Then the time taken (in minutes) by him, from B to reach the pillar, is :","6","10","20","5","d",null,"height and distance ");
insert into math_q1_a values(10,"The system of linear equations x+?y-z=0,?x-y-z=0,x+y-?z=0 has a non-trivial solution for :","infinitely many values of ?.","exactly one value of ?.","exactly two values of ?.","exactly three values of ?.","d",null,"linear equation topic");
insert into math_q1_a values(11,"If a curve y=f(x) passes through the point (1, -1) and satisfies the differential equation, y(1+xy) dx=x dy, then f(-1/2) is equal to :","-2/5","-4/5","2/5","4/5","d",null," differentiation");
insert into math_q1_a values(12,"The Boolean Expression (p?~q)?q?(~p?q) is equivalent to :","~p ? q","p ? q","p ? q","p ? ~ q","c",null,"mathematical reasoning");
insert into math_q1_a values(13,"If the mean deviation of the numbers 1, 1+d, ..., 1+100d from their mean is 255, then a value of d is :","10.1","20.2","10","5.05","a",null,"statistics");
insert into math_q1_a values(14,"The area (in sq. units) of the region described by A={(x, y)|y = x2-5X+4, x+y = 1, y = 0} is","7/2","19/6","13/6","17/6","b",null,"mensuration");
insert into math_q1_a values(15,"A ray of light is incident along a line which meets another line, 7x-y+1=0, at the point (0, 1). The ray is then reflected from this point along the line, y+2x=1. Then the equation of the line of incidence of the ray of light is :","41x-38y+38=0","41x+25y-25=0","41x+38y-38=0","41x-25y+25=0","b",null,"conic sections");






create table math_q2_a (sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));
insert into math_q2_a values(01,"All the students of a class performed poorly in Mathematics. The teacher decided to give grace marks of 10 to each of the students. Which of the following statistical measures will not change even after the grace marks were given ?"," median"," mode","variance"," mean","c",null," formula based");
insert into math_q2_a values(02,"Let Tn be the number of all possible triangles formed by joining vertices of an n-sided regular polygon. If Tn+1- Tn = 10, then the value of n is","5","10","8","7","a",null,"");
insert into math_q2_a values(03,"The number of values of k, for which the system of equations (k + 1)x + 8y = 4k kx + (k + 3)y = 3k- 1 has no solution, is","1","2","3","infinite","a",null,"");
insert into math_q2_a values(04,"Let A and B be two sets containing 2 elements and 4 elements respectively. The number of subsets of A x B having 3 or more elements is","220","219","211","256","b",null,"set & relations");
insert into math_q2_a values(05,"Distance between two parallel planes 2x + y + 2z = 8 and 4x + 2y + 4z + 5 = 0 is","5/2","7/2","9/2","3/2","b",null," ");
insert into math_q2_a values(06,"The variance of first 50 even natural numbers is","822/4","833","437","437/4","b",null,"statistics");
insert into math_q2_a values(07,"Let a,b, c and d be non-zero numbers. If the point of intersection of the lines 4ax + 2ay +c = 0 and 5bx +2by +d  = 0 lies in the fourth quadrant and is equidistant from the two axes then","2bc - 3ad =0 ","2bc +3ad=0","3bc -2ad=0","3bc +2ad","c",null,"");
insert into math_q2_a values(08,"Let PS be the median of the triangle with vertices P(2, 2), Q(6, -1) and R(7, 3). The equation of the line passing through (1, -1) and parallel to PS is","4x-7y-11=0","2x+9y+7=0","4x+7y+3=0","2x-9y-11=0","b",null,"conic sections");
insert into math_q2_a values(09,"The total number of ways in which 5 balls of different colours can be distributed among 3 persons so that each person gets at least one ball is","75","150","210","243","b",null,"probability ");
insert into math_q2_a values(10,"A ship is fitted with three engines E1, E2 and E3. The engines function independently of each other with respective probabilities 1/2,1/4 and 1/4. For the ship to be operational at least two of its engines must function. Let X denote the event that the ship is operational and let X1, X2 and X3 denote respectively the events that the engines E1, E2 and E3 are functioning. Which of the following is(are) true ?","p[X1|X]=3/16","P [Exactly two engines of the ship are functioning | X]=7/8","p[X|X2]=5/16","p[X|X1]=7/16","b",null,"");
insert into math_q2_a values(11,"Let p(x) be a real polynomial of least degree which has a local maximum at x = 1 and a local minimum at x = 3. If p(1) = 6 and p(3) = 2, then p'(0) is","5","6","4","9","d",null," ");
insert into math_q2_a values(12,"The circle passing through the point (-1, 0) and touching the y-axis at (0, 2) also passes through the point","(-3/2,0)","(-5/2,2)","(-3/5,5/2)","(-4,0)","d",null,"conic section");
insert into math_q2_a values(13,"If z is any complexnumber satisfying |z- 3- 2i| <= 2, then the minimum value of |2z- 6 + 5i| is","5","2","8","5.2","a",null,"complex numbers");
insert into math_q2_a values(14,"Let f be a real–valued differentiable function on R (the set of all real numbers) such that f(1) = 1. If the y–intercept of the tangent at any point P(x, y) on the curve y = f(x) is equal to the cube of the abscissa of P, then the value of f(–3) is equal to","6","9","8","4","b",null,"");
insert into math_q2_a values(15,"A signal which can be green or red with probability 41and55 respectively, is received by station A and then transmitted to station B. The probability of each station receiving the signal correctly is 3/4. If the signal received at station B is green, then the probability that the original signal was green is","3/5","6/7","20/23","9/20","c",null,"probability");





create table phy_q1_a (sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));
insert into phy_q1_a values(01,"A student measures the time period of 100 oscillations of a simple pendulum four times. The data set is 90 s, 91 s, 95 s and 92 s. If the minimum division in the measuring clock is 1 s, then the reported mean time should be :","92±2 s","92±5.0 s","92±1.8 s","92±3 s","a",null,"simple pendulum");
insert into phy_q1_a values(02,"The temperature dependence of resistances of Cu and undoped Si in the temperature range 300-400 K, is best described by :","Linear increase for Cu, linear increase for Si.","Linear increase for Cu, exponential increase for Si.","Linear increase for Cu, exponential decrease for Si.","Linear decrease for Cu, linear decrease for Si.","c",null,"resistances chapter");
insert into phy_q1_a values(03,"An arc lamp requires a direct current of 10 A at 80 V to function. If it is connected to a 220 V (rms), 50 Hz AC supply, the series inductor needed for it to work is close to :","80H","0.08H","0.044H","0.065","d",null,"current electricity");
insert into phy_q1_a values(04,"Arrange the following electromagnetic radiations per quantum in the order of increasing energy :A)Blue light B)Yellow light C)X-ray D)Radiowave.","D,B,A,C","A,B,D,C","C,A,B,D","B,A,D,C","A",null,"electromagnetic CHAPTER");
insert into phy_q1_a values(05,"An observer looks at a distant tree of height 10 m with a telescope of magnifying power of 20. To the observer the tree appears :","10 times taller.","10 times nearer.","20 times taller.","20 times nearer.","d",null,"ray optics");
insert into phy_q1_a values(06,"Half-lives of two radioactive elements A and B are 20 minutes and 40 minutes, respectively. Initially, the samples have equal number of nuclei. After 80 minutes, the ratio of decayed numbers of A and B nuclei will be :","1:16","4:1","1:4","5:4","d",null,"nuclei chapter");
insert into phy_q1_a values(07,"A pipe open at both ends has a fundamental frequency f in air. The pipe is dipped vertically in water so that half of it is in water. The fundamental frequency of the air column is now :","f/2","3f/4","2f","f","d",null,"waves chapter");
insert into phy_q1_a values(08,"A rocket is fired vertically from the earth with an acceleration of 2g, where g is the gravitational acceleration. On an inclined plane inside the rocket, making an angle ? with the horizontal, a point object of mass m is kept. The minimum coefficient of friction µmin between the mass and the inclined surface such that the mass does not move is :","tan?","2 tan?","3 tan?","tan2?","a",null,"friction chapter");
insert into phy_q1_a values(09,"The ratio of work done by an ideal monoatomic gas to the heat supplied to it in an isobaric process is :","3/5","2/3","3/2","2/5","d",null,"thermodynamics");
insert into phy_q1_a values(10,"Two engines pass each other moving in opposite directions with uniform speed of 30 m/s. One of them is blowing a whistle of frequency 540 Hz. Calculate the frequency heard by driver of second engine before they pass each other. Speed of sound is 330 m/sec :","450Hz","540 Hz","648 Hz","270 Hz","c",null,"waves chapter");
insert into phy_q1_a values(11,"Three capacitors each of 4 µF are to be connected in such a way that the effective capacitance is 6 µF. This can be done by connecting them :","all in series","two in series and one in parallel","all in parallel","two in parallel and one in series","b",null,"capacitors topic");
insert into phy_q1_a values(12,"A magnetic dipole is acted upon by two magnetic fields which are inclined to each other at an angle of 75o. One of the fields has a magnitude of 15 mT. The dipole attains stable equilibrium at an angle of 308 with this field. The magnitude of the other field (in mT ) is close to :","11","36","1","1060","a",null,"electromagnetism");
insert into phy_q1_a values(13,"Microwave oven acts on the principle of :","transferring electrons from lower to higher energy levels in water molecule","giving rotational energy to water molecules","giving vibrational energy to water molecules","giving translational energy to water molecules","b",null,"Microwave Radiations");
insert into phy_q1_a values(14,"A hydrogen atom makes a transition from n=2 to n=1 and emits a photon. This photon strikes a doubly ionized lithium atom (z=3) in excited state and completely removes the orbiting electron. The least quantum number for the excited state of the ion for the process is :","2","3","4","5","c",null,"Atomic Physics");
insert into phy_q1_a values(15,"An audio signal consists of two distinct sounds : one a human speech signal in the frequency band of 200 Hz to 2700 Hz, while the other is a high frequency music signal in the frequency band of 10200 Hz to 15200 Hz. The ratio of the AM signal bandwidth required to send both the signals together to the AM signal bandwidth required to send just the human speech is :","3","5","6","2","c",null,"signal and frequency");







create table phy_q2_a (sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));


insert into phy_q2_a values(01,"In an engine the piston undergoes vertical simple harmonic motion with amplitude 7 cm. A washer rests on top of the piston and moves with it. The motor speed is slowly increased. The frequency of the piston at which the washer no longer stays in contact with the piston, is close to :","0.1Hz","1.2Hz","0.7Hz","1.9Hz","d",null,"thermodynamics & waves");


insert into phy_q2_a values(02,"A toy-car, blowing its horn, is moving with a steady speed of 5 m/s, away from a wall. An observer, towards whom the toy car is moving, is able to hear 5 beats per second. If the velocity of sound in air is 340 m/s, the frequency of the horn of the toy car is close to :","680 Hz","510 Hz","340 Hz","170 Hz","d",null,"waves");


insert into phy_q2_a values(03,"A neutron moving with a speed ‘v’ makes a head on collision with a stationary hydrogen atom in ground state. The minimum kinetic energy of the neutron for which inelastic collision will take place is :","10.2 eV","16.8 eV","12.1 eV","20.4 eV","d",null,"General question");


insert into phy_q2_a values(04,"To determine refractive index of glass slab using a travelling microscope, minimum number of readings required are :","Two","Three","Four","Five","b",null,"experimental question");


insert into phy_q2_a values(05,"A uniform solid cylindrical roller of mass m is being pulled on a horizontal surface with force F parallel to the surface and applied at its centre. If the acceleration of the cylinder is a and it is rolling without slipping then the value of F is :","ma","2 ma","3/2 ma","5/3 ma","c",null,"");


insert into phy_q2_a values(06,"A bat moving at 10 ms towards a wall sends a sound signal of 8000 Hz towards it. On reflection it hears a sound of frequency f. The value of f in Hz is close to (speed of sound =5320 ms)","8285","8516","8000","8424","b",null,"waves");


insert into phy_q2_a values(07,"When current in a coil changes from 5 A to 2 A in 0.1 s, an average voltage of 50 V is produced. The self - inductance of the coil is :","0.67 H","1.67 H"," 3H"," 6H","b",null,"");


insert into phy_q2_a values(08,"You are asked to design a shaving mirror assuming that a person keeps it 10 cm from his face and views the magnified image of the face at the closest comfortable distance of 25 cm. The radius of curvature of the mirror would then be :","30 cm","24 cm"," 60 cm","-24 cm","c",null,"ray optics");


insert into phy_q2_a values(09,"In an unbiased n-p junction electrons  diffuse from n - region to p - region because :","holes in p - region attract them","electrons travel across the junction due to potential difference","electron concentration in n - region is more as compared to that in p - region","only electrons move from n to p region and not the vice - versa","c",null," ");


insert into phy_q2_a values(10,"An open glass tube is immersed in mercury in such a way that a length of 8 cm extends above the mercurylevel. The open end of the tube is then closed and sealed and the tube is raised verticallyup by additional 46cm. What will be length of the air column above mercury in the tube now? ","38 cm","6 cm","16 cm","22 cm","c",null,"based on Torricelli principle");


insert into phy_q2_a values(11,"In a large building, there are 15 bulbs of 40 W, 5 bulbs of 100 W, 5 fans of 80 W and 1 heater of 1kW. Thevoltage of the electric mains is 220 V. The minimum capacity of the main fuse of the building will be :","12A","14A","8A","10A","a",null,"  power and wattage problem");


insert into phy_q2_a values(12,"A pipe of length 85 cm is closed from one end. Find the number of possible natural oscillations of air column in the pipe whose frequencies lie below 1250 Hz. The velocity of sound in air is 340 m/s.","6","4","12","8","a",null,"waves");


insert into phy_q2_a values(13,"A diode detector is used to detect an amplitude modulated wave of 60% modulation by using a condenser of capacity 250 pico farad in parallel with a load resistance 100 kilo ohm. Find the maximum modulated frequency which could be detected by it.","10.62 kHz","5.31 mHz","5.31 kHz ","10.62  mHz","a",null,"modulation index based");


insert into phy_q2_a values(14,"What is the minimum energy required to launch a satellite of mass m from the surface of a planet of mass M and radius R in a circular orbit at an altitude of 2R?","2GmM/3R","GmM/2R","GmM/3R","5GmM/6R","d",null,"total work done");


insert into phy_q2_a values(15,"The amplitude of a damped oscillator decreases to 0.9 times its original magnitude is 5s. In another 10s it will decrease to a times its original magnitude, where a equals.","0.81","0.729","0.6","0.7","b",null,"");











create table chem_q1_a (sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));
insert into chem_q1_a values(01,"The equilibrium constant at 298 K for a reaction A+B?C+D is 100. If the initial concentration of all the four species were 1 M each, then equilibrium concentration of D (in mol L-1) will be :","0.182","0.818","1.818","1.182","c",null,"chemical equilibrium");
insert into chem_q1_a values(02,"Galvanization is applying a coating of :","pb","cr","cu","zn","d",null,"Galvanization chapter");
insert into chem_q1_a values(03,"For a linear plot of log (x/m) versus log p in a Freundlich adsorption isotherm, which of the following statements is correct ? (k and n are constants)","Both k and 1/n appear in the slope term.","1/n appears as the intercept.","Only 1/n appears as the slope.","log (1/n) appears as the intercept.","c",null,"General question");
insert into chem_q1_a values(04,"Which of the following atoms has the highest first ionization energy ?","rb","Na","K","Sc","d",null,"atomic structure chapter");
insert into chem_q1_a values(05,"Which one of the following ores is best concentrated by froth floatation method ?","Magnetite","Siderite","Galena","Malachite","c",null,"General question");
insert into chem_q1_a values(06,"The pair in which phosphorous atoms have a formal oxidation state of +3 is :","Orthophosphorous and pyrophosphorous acids","Pyrophosphorous and hypophosphoric acids","Orthophosphorous and hypophosphoric acids","Pyrophosphorous and pyrophosphoric acids","a",null,"p-block");
insert into chem_q1_a values(07,"The concentration of fluoride, lead, nitrate and iron in a water sample from an underground lake was found to be 1000 ppb, 40 ppb, 100 ppm and 0.2 ppm, respectively. This water is unsuitable for drinking due to high concentration of :","Fluoride","Lead","Nitrate","Iron","c",null,"solubility chapter ");
insert into chem_q1_a values(08,"The distillation technique most suited for separating glycerol from spent-lye in the soap industry is :","Simple distillation","Fractional distillation","Steam distillation","Distillation under reduced pressure","d",null,"General question");
insert into chem_q1_a values(09,"Which of the following statements about low density polythene is FALSE ?","Its synthesis requires high pressure.","It is a poor conductor of electricity.","Its synthesis requires dioxygen or a peroxide initiator as a catalyst.","It is used in the manufacture of buckets, dust-bins etc.","d",null,"PLASTICS AND ARTICLES THEREOF; RUBBER AND..... ");
insert into chem_q1_a values(10,"Thiol group is present in :","Cytosine","Cystine","Cysteine","Methionine","c",null,"Thiol group");
insert into chem_q1_a values(11,"Which of the following is an anionic detergent ?","Sodium stearate","Sodium lauryl sulphate","Cetyltrimethyl ammonium bromide","Glyceryl oleate","b",null,"anionic detergent");
insert into chem_q1_a values(12," The total number of orbitals associated with the principal quantum number 5 is :","5","10","20","25","d",null,"atomic structure");
insert into chem_q1_a values(13,"Which intermolecular force is most responsible in allowing xenon gas to liquefy ?","Dipole - dipole","Ion - dipole","Instantaneous dipole - induced dipole","Ionic","c",null,"states of matter");
insert into chem_q1_a values(14,"The non-metal that does not exhibit positive oxidation state is :","Oxygen","Iodine","Chlorine","Fluorine","c",null,"periodic classification of elements");
insert into chem_q1_a values(15,"The correct order of the solubility of alkaline-earth metal sulphates in water is :","Mg < Ca < Sr < Ba","Mg < Sr < Ca < Ba","Mg > Sr > Ca > Ba","Mg > Ca > Sr > Ba","d",null,"solutions chapter");





create table chem_q2_a (sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));
insert into chem_q2_a values(01,"Which one of the following properties is not shown by NO?","It combines with oxygen to form nitrogen dioxide","It’s bond order is 2.5","It is diamagnetic in gaseous state","It is a neutral oxide","c",null,"paramagnetic");
insert into chem_q2_a values(02,"The metal that cannot be obtained by electrolysis of an aqueous solution of its salts is:","Cu","Cr","Ag","Ca","d",null,"s-block");
insert into chem_q2_a values(03,"Which one of the following bases is not present in DNA","Cytosin","Thymin","Quinoline","Adenine","c",null,"mensuration based");
insert into chem_q2_a values(04,"The major organic compound formed by the reaction of 1, 1, 1– trichloroethane with silver powder is:","2- Butyne","2- Butene","Acetylene","Ethene","a",null,"structure based");
insert into chem_q2_a values(05,"The ratio of masses of oxygen and nitrogen in a particular gaseous mixture is 1 : 4. The ratio of number of their molecule is:","1:8","3:16","1:4","7:32","d",null,"moles present( hint)");
insert into chem_q2_a values(06,"The correct set of four quantum numbers for the valence elections of rubidium atom (Z= 37) is:","5,1,1,+1/2","5,0,1,+1/2","5,0,0,+1/2","5,1,0,+1/2","c",null,"[Zn]5S1");
insert into chem_q2_a values(07,"The molarity of a solution obtained by mixing 750 mL of 0.5 (M) HCl with 250 mL of 2(M)HCl will be:","1.00 M","1.75 M","0.975 M"," 0.875 M","d",null,"(MV) formula");
insert into chem_q2_a values(08,"A solution of (–) –1 – chloro –1 – phenylethane is toluene racemises slowly in the presence of a small amount of SbCl5, due to the formation of :","carbene"," carbocation"," free radical"," carbanion","b",null,"");
insert into chem_q2_a values(09,"How many litres of water must be added to 1 litre of an aqueous solution of HCl with a pH of 1 to create an aqueous solution with pH of 2?","0.9L","2.0L","9.0L","0.1L","c",null,"Initial pH = 1, New pH = 2 ");
insert into chem_q2_a values(10,"Synthesis of each molecule of glucose in photosynthesis involves:","10 molecules of ATP "," 8 molecules of ATP"," 6 molecules of ATP "," 18 molecules of ATP","d",null,"");
insert into chem_q2_a values(11,"A piston filled with 0.04 mol of an ideal gas expands reversibly from 50.0 mL to 375 mL at a constant temperature of 37.0 C. As it does so, it absorbs 208J of heat. The values of q and w for the process will be:"," q = – 208 J, w = – 208 J","q = – 208 J, w = + 208 ","q = + 208 J, w = + 208 J ","q = + 208 J, w = – 208 J","d",null,"?U = 0");
insert into chem_q2_a values(12,"Which of the following represents the correct order of increasing first ionization enthalpy for Ca, Ba, S, Se and Ar?","S < Se < Ca < Ba < Ar ","Ba < Ca < Se < S < Ar"," Ca < Ba < S < Se < Ar","Ca < S < Ba < Se < Ar","b",null,"Increasing order of first ionization enthalpy");
insert into chem_q2_a values(13,"The gas leaked from a storage tank of the Union Carbide plant in Bhopal gas tragedy was:"," Methylamine","Ammonia"," Phosgene","Methylisocyanate","d",null,"");
insert into chem_q2_a values(14,"Which of the following exists as covalent crystals in the solid state?"," Silicon","Sulphur"," Phosphorous","Iodine","a",null,"solids state");
insert into chem_q2_a values(15,"An unknown alcohol is treated with the Lucas reagent to determine whether the alcohol is primary, secondary or tertiary. Which alcohol reacts fastest and by what mechanism:","tertiary alcohol by Sn1"," secondary alcohol by Sn2","tertiary alcohol by Sn2"," secondary alcohol by Sn1","a",null," carbocation formation reaction");


create database aptitudetest;
use aptitudetest;
create table aptitudetest(sno integer(3)primary key,Question varchar(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1
varchar(02), correct2 varchar(02),correct3 varchar(02),ques_ref varchar(514));

insert into aptitudetest values("1","A flat plate is moving normal to its plane through a gas under the action of a constant force
F. The gas is kept at a very low pressure. The speed of the plate v is much less than the
average speed u of the gas molecules. Which of the following options is/are true?","The pressure difference between the leading and trailing faces of the plate is
proportional to uv","The resistive force experienced by the plate is proportional to v","The plate will continue to move with constant non-zero acceleration, at all 
times","At a later time the external force F balances the resistive force","a","b","d","Kinetic Theory of Gases");

insert into aptitudetest values("2","A diverging lens with magnitude of focal length 25 cm is placed at a distance of 15 cm from a converging lens of magnitude of 
focal length 20 cm. A beam of parallel light falls on the diverging lens. The final image formed is :","real and at a distance of 40 cm from the
divergent lens"," real and at a distance of 6 cm from the
convergent lens"," real and at a distance of 40 cm from convergent
lens","virtual and at a distance of 40 cm from
convergent lens.","c",null,null,"Optics"); 

insert into aptitudetest values("3","In Young's Double slit experiment,slits are separated by 0.5 mm, and the screen is placed 150 cm away. A beam of light consisting
 of two wavelengths, 650 nm and 520 nm, is used to obtain interference fringes on the screen. The least distance from the common central maximum to the
point where the bright fringes due to both the wavelengths coincide is :","9.75 mm","15.6 mm","1.56 mm","7.8 mm","d",null,null,"Wave optics");

insert into aptitudetest values("4","Dissolving 120g of Urea (mo. wt. 60) in 100g of water gave a solution of density 1.15g/ml.The molarity of the solution is:","1.78M",
"2M","2.05M","2.22M","c",null,null,"Solutions");

insert into aptitudetest values("5","Extraction of metal from the ore cassiterite involves","Carbon reduction of an oxide ore","self-reduction of an sulphide ore",
"removal of copper impurity","removal of iron impurity","a","d",null,"Metallurgy");

insert into aptitudetest values("6","According to Kinetic theory of gases:","Collisions are always elastic","heavier molecules transfer more momentum to the wall of 
container","only a small number of molecules habe very high velocity","between collisions,the molecules move in stright lines with constant velocities","a","c","d",
"Kinetic theory of gases");


insert into aptitudetest values("7","If the 2nd, 5th and 9th terms of a non-constant A.P. are in G.P., then the common ratio of this G.P. is:","4/3","1","7/4","8/5",
"a",null,null,"A.P,G.P");


insert into aptitudetest values("8","Let two fair six-faced dice A and B be thrown simultaneously. If E1 is the event that die A shows up four, E2 is the event that 
die B shows up two and E3 is the event that the sum of numbers on both dice is odd, then which of the following statements is NOT true? ","E2 and E3 are independent."
,"E1 and E3 are independent","E1, E2 and E3 are independent.","E1 and E2 are independent.","c",null,null,"Probabilty");


insert into aptitudetest values("9","A man is walking towards a vertical pillar in a straight path, at a uniform speed. At a certain point A on the path, he observes
 that the angle of elevation of the top of the pillar is 30 degree's. After walking for 10 minutes from A in the same direction, at a point B, he observes that the angle of
 elevation of the top of the pillar is 60 degree's. Then the time taken (in minutes) by him, from B to reach the pillar, is:","10","20","5","6","c",null,null,"Trignometry");

create database levela;
use levela;
create table matha(sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));


insert into matha values(01,"In a library, there are m books of mathematics and n books of natural science. They can be placed on a shelf in 1209600 ways so that the books of the same subject are not separated.If m>=n. then m =","6","7","8","9","b",null,"Permutations and Combinations");




insert into matha values(02,"The altitude through A of triangle ABC meets BC at D and the circumscribed circle at E. If D=(2,3),E=(5,5), the ordinate of the orthocentre being a natural number. Find the probability that the orthocentre lies on the lines","required probability is 2/5","required probability is 4/5"," required probability is 3/5","none of these","c",null,"probability");



insert into matha values(03," Assertion
The minimum value of the expression sina+sinb+sinc where a,b,c are real number such that a+b+c=p, is negative because-
Reason
a,b,c are angles of a triangle.","Both Assertion and Reason are correct and Reason is the correct explanation for Assertion","Both Assertion and Reason are correct and Reason is not the correct explanation for Assertion","Assertion is correct but Reason is incorrect","Assertion is incorrect but Reason is correct","c",null,"Trigonometry");





insert into matha values(04," 1+1/3+1/3.3/6+1/3.3/6.5/9+...=","3","2","1.732","2.236","c",null,"Binomial Theorem");




insert into matha values(05," The centre of a rectangular hyperbola lies on the line y=2x. If one of the asymptotes is x+y+c=0, then the other asymptote is","3x-3y-c=0","2x-y+c=0","x-y-c=0"," none of these","a",null,"Hyperbola");





insert into matha values(06,"The condition on a and b, such that the portion of the line ax+by-1=0, intercepted between the lines ax+y=0 and x+by=0, subtends a right angle at the origin is","a=b"," a+b=0","a=2b","2a=b","b",null,"Straight Lines and Pair of Straight Lines");  



insert into matha values(07,"Given an A.P. whose terms are all positive integers. The sum of its first nine terms is greater than 200 and less than 220. If the second term in it is 12, then is 4th term is:","8","16","20","24","c",null,"Sequences and Series");




insert into matha values(08,"A rectangle ABCD has its side AB parallel to line y=x and vertices A,B and D lie on y=1,x=2 and x=-2 respectively. Locus of vertex C is","x=5","x-y=5","y=5","x+y=5","c",null,"Coordinate Geometry");



 insert into matha values(09,"The product of two consecutive positive integers is divisible by 2. Using this theory, consider p and (p+1) as two consecutive numbers where p=2q+1 and q=4. Then which of the following is a factor of the product. ","54","56","45","55","c",null,"Playing with Numbers");



 insert into matha values(10,"If sum of the distances of a point from two perpendicular lines in a plane is 1,then its locus is","a square","a circle"," a straight line","two intersecting lines","a",null,"Coordinate Geometry");



 









create table chemistrya(sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 varchar(02),ques_ref varchar(514));


insert into chemistrya values(01," The increasing order (lowest first) for the values of e/m (charge/mass) for electron (e), proton (p),neutron (n) and alpha particle (a) is :","e, p, n, a","n, p, e, a","n, p, a, e","n, a, p, e","d",null,"
Atomic Structure");




insert into chemistrya values(02,"  A quantity of gas is collected in a graduated tube over the mercury. The volume of the gas at 200C is 50.0mL and the level of the mercury in the tube is 100 mm above the outside mercury level. The barometer reads 750 mm. Volume at STP is :","39.8 ml","40 ml","42 ml","60 ml","d",null,"Atoms and Molecules");





insert into chemistrya values(03," What factors determine whether two liquids are miscible or not?","molecular size"
,"molecular polarity","density","both b and c","b",null,"Matter in Our Surroundings");



insert into chemistrya values(04,"Which prediction(s) is/are incorrect according to the Lother Meyer's curve?
This question has multiple correct options","
Each peak of the curve is occupied by the alkali metals","Alkaline earth metals occupy ascending positions of curve ","Atomic volume increases first and then decreases in a period (which is defined later) in Lother Meyer's curve","Identically placed elements in the atomic volume vs atomic mass curve occur in the same period in the periodic tabl","c","d","Periodic Classification of Elements
");





insert into chemistrya values(05," The weight percent of source (formula weight  = 342 g mol-1g mol-1 ) in an aqueous solution is 3.42. The density of the solution is 1 g m/L , the concentration of sucrose in the solution in mol /L is: ","0.01","0.1 ","1.0",
"10","b",null,"Solutions");





insert into chemistrya values(06,"  200 ml of 1M HCl is mixed with 400 ml of 0.5M NaOH. The temperature rise in the calorimeter was found to be 4.0C. Water equivalent of calorimeter is 25g and the specific heat of the solution is 1 cal/mL/degree. If the theoritical heat of neutralization of a strong acid and strong base is -13.5 kcal, then the percentage error  in this experiment while calculating the heat of neutralization is","7.4 ","3","5.6","4.5","a",null,"Thermodynamics");






insert into chemistrya values(07," Assertion
Methane is known as marsh gas or fire damp.
Reason
Methane is colourless, odourless gas that occurs abundantly in nature as the chief constituent of natural gas, as a component of firedamp in coal mines, and as a product of the anaerobic bacterial decomposition of vegetable matter under water.","Both Assertion and Reason are correct and Reason is the correct explanation for Assertion","
Both Assertion and Reason are correct but Reason is not the correct explanation for Assertion.","
Assertion is correct but Reason is incorrect.","
Both Assertion and Reason are incorrect.","a",null,"Organic Chemistry");




insert into chemistrya values(08," A radioactive isotope having a half-life of 3 days was received after 12 days. It was found that there were 3 gm of the isotope in the container. The initial weight of the isotope when packed was-","12 gm","24 gm","36 gm","48 gm","d",null,"chemical 
kinetics");




insert into chemistrya values(09,"What name is given to the class of enzymes which catalyze the oxidation of one substrate with simultaneous reduction of another substrate ?","oxidoreductase ","
oxireducants","redusooxidise","none of these","a",null,"Biomolecules");




insert into chemistrya values(10,"A larger number of oxidation states are exhibited by the actinides than those by the lanthanides. The main reason being :","more reactive nature of the actinides than the lanthanides","4f orbitals are more diffused than the 5f orbitals",
"lesser energy difference between 5f and 6d orbitals than between 4f and 5d orbitals","
more energy difference between 5f and 6d orbitals than between 4f and 5d orbitals","c",null,"
d and f Block elements");











create table physicsa(sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), 
moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), 
correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));


insert into physicsa values(01,"The gravitational potential of two homogeneous spherical shells of same surface density at
 their respective center are 3V and 4V. If the two shells coalesce into single one keeping surface density same, the potential
 at a point inside the shell is","12v","7v","5v","127v","c",null,"gravitation");



insert into physicsa values(02,"A lady reaches her office 20 minutes late by traveling at a speed of 20 km/h
 and reaches 15 minutes early by traveling at 30 km/h. 
By how much time will she be early or late if she travels a 25 km/h ?","1 minute early","5 minute early","1 minute late","5 minute late",
"a",null,"Kinematics");





insert into physicsa values(03,"The frequency of a sonometer wire is f, but when the weights producing 
the tensions are completely immersed in water the frequency becomes f/2 and on
 immersing the weights in a certain liquid the frequency becomes f/3. The specific gravity of the liquid is :","4/3","16/9","15/12","32/27",
"d",null,"Wave Motion and String Waves");




insert into physicsa values(04,"Two wires A and B with lengths in the ratio of 3 : 1, diameters in the ratio of 1:2 and 
resistivity in the ratio of 1:20 are
 joined in parallel with a source of e.m.f. 2V. Ratio of the rates of heat production is","5 : 2","2 : 5","5 : 3","3 : 5","c",null,"Current 
Electricity");








insert into physicsa values(05,"Two cubes of size 1.0m1.0m sides, one of relative density 0.600.60 and 
another of relative density=1.15=1.15 are connected by weightless wire and placed in a large tank of water. 
Under equilibrium the lighter cube will project above the water surface to a height of","50cm","25 cm","10 cm","zero","b",null,
"Fluid Mechanics");




insert into physicsa values(06," A pendulum clock loses 12s a day if the temperature is 40C and goes
 fast by 4s a day if the temperature is 20C. 
Find the temperature at which the clock will show correct time.","T=25C","T=15C","T=20C","T=27.5C","a",null,"
Thermal Expansion");





insert into physicsa values(07,"In a transformer the output current and voltage are respectively 4 A4 A and 20 V20 V. If the ratio of number
 of turns in the primary to secondary is 2:12:1, what is the input current and voltage?","2 A and 40 V","8 A and 10 V",
"4 A and 10 V","8 V and 40 V","a",null,"Alternating Current");







insert into physicsa values(08,"A green light is incident from the water to the air - water 
interface at the critical angle (i). Select the correct statement","the spectrum of visible light whose frequency is more 
than that of green light will come out to the air medium","the entire spectrum of visible 
light will come out of the water at various angle to the normal.","the entire spectrum of visible light will 
come out of the water at angle of 90 to the normal.","the spectrum of visible light whose frequency 
is less than that of green light will come out to the air medium.","d",null,"
Optics");






insert into physicsa values(09,"A small metallic ball is suspended in a uniform electric field by a thread. 
If high energy X-rays are made to fall on it , then:","ball will be displaced in opposite direction to the direction of field",
"ball will be displaced in the direction of field ","ball will remain in equilibrium state","ball will start oscillating","b",null,
"Electromagnetic Waves");





insert into physicsa values(10,"The length of a thin wire require to manufacture a solenoid of length l=100 cm and inductance L=1mH,
 if the solenoid's cross-sectional diameter is considerably less than its length is:","1 km","0.10 km","0.010 km","10 km","b",null,
"Electromagnetic Induction");






create database levelb;
use levelb;
create table mathb(sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));


insert into mathb values(01,"In a library, there are m books of mathematics and n books of natural science. They can be placed on a shelf in 1209600 ways so that the books of the same subject are not separated.If m>=n. then m =","6","7","8","9","b",null,"Permutations and Combinations");




insert into mathb values(02,"The altitude through A of triangle ABC meets BC at D and the circumscribed circle at E. If D=(2,3),E=(5,5), the ordinate of the orthocentre being a natural number. Find the probability that the orthocentre lies on the lines","required probability is 2/5","required probability is 4/5"," required probability is 3/5","none of these","c",null,"probability");



insert into mathb values(03," Assertion
The minimum value of the expression sina+sinb+sinc where a,b,c are real number such that a+b+c=p, is negative because-
Reason
a,b,c are angles of a triangle.","Both Assertion and Reason are correct and Reason is the correct explanation for Assertion","Both Assertion and Reason are correct and Reason is not the correct explanation for Assertion","Assertion is correct but Reason is incorrect","Assertion is incorrect but Reason is correct","c",null,"Trigonometry");





insert into mathb values(04," 1+1/3+1/3.3/6+1/3.3/6.5/9+...=","3","2","1.732","2.236","c",null,"Binomial Theorem");




insert into mathb values(05," The centre of a rectangular hyperbola lies on the line y=2x. If one of the asymptotes is x+y+c=0, then the other asymptote is","3x-3y-c=0","2x-y+c=0","x-y-c=0"," none of these","a",null,"Hyperbola");





insert into mathb values(06,"The condition on a and b, such that the portion of the line ax+by-1=0, intercepted between the lines ax+y=0 and x+by=0, subtends a right angle at the origin is","a=b"," a+b=0","a=2b","2a=b","b",null,"Straight Lines and Pair of Straight Lines");  



insert into mathb values(07,"Given an A.P. whose terms are all positive integers. The sum of its first nine terms is greater than 200 and less than 220. If the second term in it is 12, then is 4th term is:","8","16","20","24","c",null,"Sequences and Series");




insert into mathb values(08,"A rectangle ABCD has its side AB parallel to line y=x and vertices A,B and D lie on y=1,x=2 and x=-2 respectively. Locus of vertex C is","x=5","x-y=5","y=5","x+y=5","c",null,"Coordinate Geometry");



 insert into mathb values(09,"The product of two consecutive positive integers is divisible by 2. Using this theory, consider p and (p+1) as two consecutive numbers where p=2q+1 and q=4. Then which of the following is a factor of the product. ","54","56","45","55","c",null,"Playing with Numbers");



 insert into mathb values(10,"If sum of the distances of a point from two perpendicular lines in a plane is 1,then its locus is","a square","a circle"," a straight line","two intersecting lines","a",null,"Coordinate Geometry");



 








create table chemistryb(sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1 varchar(02), correct2 varchar(02),ques_ref varchar(514));


insert into chemistryb values(01," The increasing order (lowest first) for the values of e/m (charge/mass) for electron (e), proton (p),neutron (n) and alpha particle (a) is :","e, p, n, a","n, p, e, a","n, p, a, e","n, a, p, e","d",null,"
Atomic Structure");




insert into chemistryb values(02,"  A quantity of gas is collected in a graduated tube over the mercury. The volume of the gas at 200C is 50.0mL and the level of the mercury in the tube is 100 mm above the outside mercury level. The barometer reads 750 mm. Volume at STP is :","39.8 ml","40 ml","42 ml","60 ml","d",null,"Atoms and Molecules");





insert into chemistryb values(03," What factors determine whether two liquids are miscible or not?","molecular size"
,"molecular polarity","density","both b and c","b",null,"Matter in Our Surroundings");



insert into chemistryb values(04,"Which prediction(s) is/are incorrect according to the Lother Meyer's curve?
This question has multiple correct options","
Each peak of the curve is occupied by the alkali metals","Alkaline earth metals occupy ascending positions of curve ","Atomic volume increases first and then decreases in a period (which is defined later) in Lother Meyer's curve","Identically placed elements in the atomic volume vs atomic mass curve occur in the same period in the periodic tabl","c","d","Periodic Classification of Elements
");





insert into chemistryb values(05," The weight percent of source (formula weight  = 342 g mol-1g mol-1 ) in an aqueous solution is 3.42. The density of the solution is 1 g m/L , the concentration of sucrose in the solution in mol /L is: ","0.01","0.1 ","1.0",
"10","b",null,"Solutions");





insert into chemistryb values(06,"  200 ml of 1M HCl is mixed with 400 ml of 0.5M NaOH. The temperature rise in the calorimeter was found to be 4.0C. Water equivalent of calorimeter is 25g and the specific heat of the solution is 1 cal/mL/degree. If the theoritical heat of neutralization of a strong acid and strong base is -13.5 kcal, then the percentage error  in this experiment while calculating the heat of neutralization is","7.4 ","3","5.6","4.5","a",null,"Thermodynamics");






insert into chemistryb values(07," Assertion
Methane is known as marsh gas or fire damp.
Reason
Methane is colourless, odourless gas that occurs abundantly in nature as the chief constituent of natural gas, as a component of firedamp in coal mines, and as a product of the anaerobic bacterial decomposition of vegetable matter under water.","Both Assertion and Reason are correct and Reason is the correct explanation for Assertion","
Both Assertion and Reason are correct but Reason is not the correct explanation for Assertion.","
Assertion is correct but Reason is incorrect.","
Both Assertion and Reason are incorrect.","a",null,"Organic Chemistry");




insert into chemistryb values(08," A radioactive isotope having a half-life of 3 days was received after 12 days. It was found that there were 3 gm of the isotope in the container. The initial weight of the isotope when packed was-","12 gm","24 gm","36 gm","48 gm","d",null,"chemical 
kinetics");




insert into chemistryb values(09,"What name is given to the class of enzymes which catalyze the oxidation of one substrate with simultaneous reduction of another substrate ?","oxidoreductase ","
oxireducants","redusooxidise","none of these","a",null,"Biomolecules");




insert into chemistryb values(10,"A larger number of oxidation states are exhibited by the actinides than those by the lanthanides. The main reason being :","more reactive nature of the actinides than the lanthanides","4f orbitals are more diffused than the 5f orbitals",
"lesser energy difference between 5f and 6d orbitals than between 4f and 5d orbitals","
more energy difference between 5f and 6d orbitals than between 4f and 5d orbitals","c",null,"
d and f Block elements");











create table physicsb(sno integer(4) PRIMARY KEY , question VARCHAR(1024), moq1 VARCHAR(512), 
moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), 
correct1 varchar(02), correct2 integer(02),ques_ref varchar(514));


insert into physicsb values(01,"The gravitational potential of two homogeneous spherical shells of same surface density at
 their respective center are 3V and 4V. If the two shells coalesce into single one keeping surface density same, the potential
 at a point inside the shell is","12v","7v","5v","127v","c",null,"gravitation");



insert into physicsb values(02,"A lady reaches her office 20 minutes late by traveling at a speed of 20 km/h
 and reaches 15 minutes early by traveling at 30 km/h. 
By how much time will she be early or late if she travels a 25 km/h ?","1 minute early","5 minute early","1 minute late","5 minute late",
"a",null,"Kinematics");





insert into physicsb values(03,"The frequency of a sonometer wire is f, but when the weights producing 
the tensions are completely immersed in water the frequency becomes f/2 and on
 immersing the weights in a certain liquid the frequency becomes f/3. The specific gravity of the liquid is :","4/3","16/9","15/12","32/27",
"d",null,"Wave Motion and String Waves");




insert into physicsb values(04,"Two wires A and B with lengths in the ratio of 3 : 1, diameters in the ratio of 1:2 and 
resistivity in the ratio of 1:20 are
 joined in parallel with a source of e.m.f. 2V. Ratio of the rates of heat production is","5 : 2","2 : 5","5 : 3","3 : 5","c",null,"Current 
Electricity");








insert into physicsb values(05,"Two cubes of size 1.0m1.0m sides, one of relative density 0.600.60 and 
another of relative density=1.15=1.15 are connected by weightless wire and placed in a large tank of water. 
Under equilibrium the lighter cube will project above the water surface to a height of","50cm","25 cm","10 cm","zero","b",null,
"Fluid Mechanics");




insert into physicsb values(06," A pendulum clock loses 12s a day if the temperature is 40C and goes
 fast by 4s a day if the temperature is 20C. 
Find the temperature at which the clock will show correct time.","T=25C","T=15C","T=20C","T=27.5C","a",null,"
Thermal Expansion");





insert into physicsb values(07,"In a transformer the output current and voltage are respectively 4 A4 A and 20 V20 V. If the ratio of number
 of turns in the primary to secondary is 2:12:1, what is the input current and voltage?","2 A and 40 V","8 A and 10 V",
"4 A and 10 V","8 V and 40 V","a",null,"Alternating Current");







insert into physicsb values(08,"A green light is incident from the water to the air - water 
interface at the critical angle (i). Select the correct statement","the spectrum of visible light whose frequency is more 
than that of green light will come out to the air medium","the entire spectrum of visible 
light will come out of the water at various angle to the normal.","the entire spectrum of visible light will 
come out of the water at angle of 90 to the normal.","the spectrum of visible light whose frequency 
is less than that of green light will come out to the air medium.","d",null,"
Optics");






insert into physicsb values(09,"A small metallic ball is suspended in a uniform electric field by a thread. 
If high energy X-rays are made to fall on it , then:","ball will be displaced in opposite direction to the direction of field",
"ball will be displaced in the direction of field ","ball will remain in equilibrium state","ball will start oscillating","b",null,
"Electromagnetic Waves");





insert into physicsb values(10,"The length of a thin wire require to manufacture a solenoid of length l=100 cm and inductance L=1mH,
 if the solenoid's cross-sectional diameter is considerably less than its length is:","1 km","0.10 km","0.010 km","10 km","b",null,
"Electromagnetic Induction");






create database levelc;
use levelc;
create table mathc(sno integer(3)primary key,Question varchar(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1
varchar(02), correct2 varchar(02),correct3 varchar(02),ques_ref varchar(514));

insert into mathc values ("1","How many ways are there to arrange the letters in the word GARDEN with the vowels in alphabetical order? ","120","480","360","240","c",
null,null,"Permutation and Combination");

insert into mathc values("2","Let R = {(1, 3), (4, 2), (2, 4), (2, 3), (3, 1)} be a relation on the set A = {1, 2, 3, 4}. The relation R is ","a function","reflexive",
"not symmetric","transitive","c",null,null,"Relations anf Funuctions");


insert into mathc values("3","A person standing on the bank of a river observes that the angle of elevation of the top of a tree on the opposite bank of the river is 
60degree and when he retires 40 meter away from the tree the angle of elevation becomes30degree . The breadth of the river is","20m","30m","40m","60m","a",null,null,
"Trignometry");

insert into mathc values("4","The normal to the curve x = a(1 + cos?), y = asin? at ? always passes through the fixed point ","(a,0)","(0,a)","(0,0)","(a,a)","a",
null,null,"Conics");

insert into mathc values("5","The area of the region bounded by the curves y=x-2 , x=1,x=3 and the x-axis is","1","2","3","4","a",null,null,"Calcus");

insert into mathc values("6","Let A (2, -3) and B(-2, 1) be vertices of a triangle ABC. If the centroid of this triangle moves on the line 2x + 3y = 1, then the locus 
of the vertex C is the line","2x+3y=9 ","2x-3y=7","3x+2y=5","3x-2y=3","a",null,null,"Triangle");


insert into mathc values("7","Distance between two parallel planes 2x + y + 2z = 8 and 4x + 2y + 4z + 5 = 0 is ","3/2","5/2","7/2","9/2","c",null,null,"Geometry");

insert into mathc values("8","A line with direction cosines proportional to 2,1,2 meets each of the lines x=y+a=z and x+a=2y=2z.The co-ordinates of each of the point 
of intersection are given by ","(3a,3a,3a),(a,a,a)","(3a,2a,3a),(a,a,a)","(3a,2a,3a),(a,a,2a)","(2a,3a,3a),(2a,a,a)","b",null,null,"Vector Algebra");

insert into mathc values("9","The probability that A speaks truth is 4/5,while this probability for B is 3/4 . The probability that they contradict each other when 
asked to speak on a fact is","3/20","1/5","7/20","4/5","c",null,null,"Probability");

insert into mathc values("10","The mean and the variance of a binomial distribution are 4 and 2 respectively. Then the probability of 2 successes is","37/256",
"219/256","128/256","28/256","d",null,null,"Probability");

use levelc;
create table physicsc(sno integer(3)primary key,Question varchar(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1
varchar(02), correct2 varchar(02),correct3 varchar(02),ques_ref varchar(514));

insert into physicsc values("1","A thin rectangular magnet suspended freely has a period of oscillation equal to T. Now it is broken into two equal halves 
(each having half of the original length) and one piece is made to oscillate freely in the same field. If its period of oscillation is T', the ratio T'/T is ","1/5",
"1/2","2","1/4","b",null,null,"Wave and Oscillations");

insert into physicsc values("2","A spring balance is attached to the ceiling of a lift. A man hangs his bag on the spring and the spring reads 49 N, when the lift is 
stationary. If the lift moves downward with an acceleration of 5 m/s^2 ,the reading of the spring balance will be","24N","74N","15N","79N","a",null,null,"Kinematics");


insert into physicsc values("3","The negative Zn pole of a Daniell cell, sending a constant current through a circuit, decreases in mass by 0.13 g in 30 minutes. 
If the electrochemical equivalent of Zn and Cu are 32.5 and 31.5 respectively, the increase in the mass of the positive Cu pole in this time is ","0.180g","0.141g",
"0.126g","0.242g","c",null,null,null);

insert into physicsc values("4","The time period of a satellite of earth is 5 hours. If the separation between the earth and the satellite is increased to 4 times the 
previous value, the new time period will become ","10hr","80hr","40hr","20hr","c",null,null,"Gravitation");


insert into physicsc values("5","A particle performing uniform circular motion has angular momentum L. If its angular frequency is doubled and its kinetic energy 
halved, then the new angular momentum is ","L/4","2L","4L","L/2","a",null,null,"Circular Motion");

insert into physicsc values("6","A car moving with a speed of 50 km/hr, can be stopped by brakes after at least 6 m. If the same car is moving at a speed of 100 km/hr, the minimum stopping 
distance is","12m","18m","24m","6m","c",null,null,"Kinematics");

insert into physicsc values("7","A boy playing on the roof of a 10 m high building throws a ball with a speed of 10 m/s at an angle of 30degree with the horizontal. How far from the throwing point 
will the ball be at the height of 10 m from the ground? ","5.20m","4.33m","2.60m","8.66m","d",null,null,"Kinematics");

insert into physicsc values("8","An ammeter reads upto 1 ampere. Its internal resistance is 0.81 ohm. To increase the range to 10 A the value of the required shunt is","0.03ohm","0.3ohm","0.9ohm",
"0.09ohm","d",null,null,"Current Electricity");

insert into physicsc values("9","A marble block of mass 2 kg lying on ice when given a velocity of 6 m/s is stopped by friction in 10 s. then the coefficient of friction is","0.02","0.03","0.04",
"0.01","c",null,null,"Work,Force and Energy");

insert into physicsc values("10","A mass M is suspended from a spring of negligible mass. The spring is pulled a little and then released so that the mass executes SHM of time period T. If the mass
is increased by m, the time period becomes 5T/3. then the ratio of m/M is","3/5","25/9","16/9","5/3","c",null,null,"Waves and Oscillations");


use levelc;
create table chemistryc(sno integer(3) primary key,Question varchar(1024), moq1 VARCHAR(512), moq2 VARCHAR(512), moq3 VARCHAR(512), moq4 VARCHAR(512), correct1
varchar(02), correct2 varchar(02),correct3 varchar(02),ques_ref varchar(514));

insert into chemistryc values("1","Consider the ground state of Cr atom (Z = 24). The number of electrons with the azimuthal quantum numbers I =1 and 2 are respectively","12and4","16and5","16and4",
"12and5","d",null,null,"Atomic Structure");

insert into chemistryc values("2","Which among the following factors is the most important in making fluorine the strongest oxidizing halogen?","Electron affinity","Bond dissociation energy",
"Hydration enthalpy","Ionization enthalpy","b",null,null,"Group 17");


insert into chemistryc values("3","In Vander Waals equation of state of the gas law, the constant b is a measure of","intermolecular repulsions","intermolecular collisions per unit volume",
"Volume occupied by the molecules","intermolecular attraction","c",null,null,"Atomic Structure");

insert into chemistryc values("4","Which of the following liquid pairs shows a positive deviation from Raoults law?","Water hydrochloric acid","Acetone chloroform","Water nitric acid",
"Benzene methanol","d",null,null,null);

insert into chemistryc values("5","In hydrogen oxygen fuel cell, combustion of hydrogen occurs to","generate heat","remove adsorbed oxygen from electrode surfaces","produce high purity water",
"create potential difference between the two electrodes","d",null,null,"s-block");

insert into chemistryc values("6","In first order reaction, the concentration of the reactant decreases from 0.8 M to 0.4 M in 15 minutes. The time taken for the concentration to change from 0.1 
M to 0.025 M is","30 minutes","60 minutes","7.5 minutes","15 minutes","a",null,null,"Solutions");

insert into chemistryc values("7","Which one the following statement regarding helium is incorrect?","It is used to fill gas balloons instead of hydrogen because it is lighter and non 
inflammable","It is used in gas cooled nuclear reactors","It is used to produce and sustain powerful superconducting reagents","It is used as cryogenic agent for carrying out experiments at low 
temperatures","a",null,null,"S-block");

insert into chemistryc values("8","One mole of magnesium nitride on the reaction with an excess of water gives","one mole of ammonia","two moles of nitric acid","two moles of ammonia","one mole 
of nitric acid","c",null,null,null);

insert into chemistryc values("9","Which one of the following ores is best concentrated by froth floatation method?","Magnetite","Malachite","Galena","Cassiterite","c",null,null,"Metallurgy");

insert into chemistryc values("10","The coordination number of central metal atom in a complex is determined by","the number of ligands around a metal ion bonded by sigma bonds","the number of 
only anionic ligands bonded to the metal ion","the number of ligands around a metal ion bonded by sigma and pi- bonds both","the number of ligands around a metal ion bonded by pi-bonds","a",null,
null,"Co-ordinations Compounds");


































