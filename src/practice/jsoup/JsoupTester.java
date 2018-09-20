package practice.jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.safety.Whitelist;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;
import org.xml.sax.InputSource;

public class JsoupTester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String html = "<p><b>Eies</b> av Strawberry Brothers (40 prosent), Aspelin Ramm (40 prosent) og Høegh Eiendom (20 prosent).</p><p><b>Budsjett:</b> 2,2 milliarder kroner.</p><p><b>250</b> hotellrom og 21 suiter i ambassadebygget ved siden av.</p><p><b>4–5</b> restauranter, 2 barer. Takterrasse med svømmebasseng, uteservering og helårsrestaurant. Klubbscene som tar 700 personer. Vestkantbadet restaureres.</p><p><b>Åpner</b> våren 2021.</p>";
		//String html = "<p>Åpnet i 2018 i et høyhus fra 1881.</p><p>285 rom.</p><p>123 Nassau Street, New York.</p><p><a href=\"https://www.thebeekman.com/\" target=\"_blank\">thebeekman.com</a></p>";
		//String html = "<p>Åpner i mars 2019 i det tidligere hovedkontoret til Den norske Amerikalinje fra 1919.</p><p>122 rom.</p><p>Jernbanetorget 2, Oslo.</p><p><a href=\"http://amerikalinjen.com/no/hjem/\" target=\"_blank\">amerikalinjen.com</a></p>";
		//String html = "<div> <p><span id=\"docs-internal-guid-68736f9e-7fff-2737-57e7-b73dded4fd1a\"></span></p> <p class=\"body-leadin\" data-element-type=\"body-leadin\">– Sommerro kan bli det råeste vi har gjort i Norden. Et gigantisk prosjekt. Det eneste jeg vet, er at det kommer til å koste over to milliarder.</p> <p>Hotelleier og investor Petter Stordalen (55) ler bak møtebordet og vrenger av seg skinnjakken med sommerfugler oppover ermene. Han snakker om de gamle lokalene til Oslo Lysverker på Solli plass, tegnet av Bjercke og Eliassen, et av landets mest kjente arkitektfirmaer i første halvdel av 1900-tallet.</p> <p>I den fredningsverdige bygningen fra 1931 skal Stordalen åpne hotell Sommerro våren 2021, med 250 hotellrom, 21 suiter, flere restauranter og barer – og Oslos første takterrasse med svømmebasseng.</p> <p>– Når du får muligheten til å gjøre noe i et sånt bygg, må du gjøre noe ingen har sett før, sier han.</p> <link href=\"/v1/content/2-1-b92c131bdb53a56b4fb291bfb7b131a1\" rel=\"inline\" source=\"drpublish\" ref=\"25\" /> <link href=\"/v1/content/2-1-790876609a24d78cf0b9e751e5caeba0\" rel=\"inline\" source=\"drpublish\" ref=\"12\" /> <link href=\"/v1/content/2-1-90ab047435b147021b0643160b1d42d1\" rel=\"inline\" source=\"drpublish\" ref=\"30\" /> <p class=\"subhead\" data-element-type=\"subhead\">Historie. Gamle posthus, fengsler, teatre, kirker, avishus og banker. Når de fleste har sett det meste – i hvert fall på Instagram – holder det tilsynelatende ikke å by hotellgjestene på noe de har opplevd før.</p> <p>– Det å gjøre historiske bygninger om til hoteller er mer populært enn noensinne, sier Deanna Ting, seniorredaktør for amerikanske Skift, et av reiselivsbransjens største og viktigste nettsteder.</p> <p>Ta bare noen av verdens mest omtalte hoteller de seneste årene: I Los Angeles holder Ace Hotel til i et forhenværende teater og kirkerom fra 1927; tidligere i år åpnet celebre NoMad dørene i Bank of Italy fra 1920. I New York er et 130 år gammelt høyhus blitt det sagnomsuste hotellet The Beekman, og TWA-terminalen på JFK-flyplassen blir til TWA Hotel neste år.</p> <p>– Historiske bygninger har noe som er vanskelig å skape, nemlig historie. Og det kan være et mektig pr-redskap, sier Ting.</p> <p>I London er en gammel brannstasjon fra 1889 blitt hotellet Chiltern Firehouse, en gammel baptistkirke er blitt L’Oscar, Midland Bank er blitt The Ned – og det tidligere krigsministeriet skal snart åpne for overnattingsgjester.</p> <p>Og i Antwerpen jobber den belgiske stjernearkitekten Vincent van Duysen med å omgjøre et kloster til hotell.</p> <p>– I storbyer med få nye tomter kan det også være enklere å bygge i allerede eksisterende bygninger. Og så har du hele boutiquehotelltrenden, som var først ute med å se potensialet i slike bygninger, sier Ting.</p> <link href=\"/v1/content/2-1-49fd33a0f18abdf598edf48822ab0421\" rel=\"inline\" source=\"drpublish\" ref=\"26\" /> <link href=\"/v1/content/2-1-1772333d7038ac86ba40fb6bb09b1491\" rel=\"inline\" source=\"drpublish\" ref=\"31\" /> <p>Også i Skandinavia er trenden fremtredende. I tillegg til at Petter Stordalen er i gang med å omgjøre sentralpostbygningen i København til hotell, åpnet Nobis Hotel i det tidligere Kongelige Danske Musikkonservatorium i fjor. Svenskene har fått Bank ­Hotel i et bankpalass i Stockholm og Clarion Hotel Post i Göteborgs tidligere posthus. Og nå skal Stordalen og samarbeidspartnerne i tillegg til å gi seg i kast med Oslo Lysverker i Sommerrogata, gjøre det tidligere hovedkontoret til Den norske Amerikalinje på Jernbanetorget og den tidligere postbygningen i København om til hoteller.</p> <div class=\"dn-relation-block\">  <strong>Les også:</strong>  <link href=\"/v1/content/2-1-389240\" rel=\"inline\" source=\"drpublish\" ref=\"37\" /> </div> <link href=\"/v1/content/2-1-5c75c2adc3c694a9f64c58dfc780da2a\" rel=\"inline\" source=\"drpublish\" ref=\"13\" /> <p class=\"subhead\" data-element-type=\"subhead\">Kompleks omvandling. Det blåser på taket til Oslo Lysverker. Utsikten er spektakulær: Holmenkollen. Regjeringsbygget. Oslofjorden. Sjømannsskolen. Ekebergrestauranten.</p> <p>– Og når den sirkelformede restauranten i to etasjer der borte står ferdig, vil det være mulig å se hele byen, sier Sverre Landmark (57), direktør for samfunn og plan i Aspelin Ramm Eiendom.</p> <p>Eiendomsselskapet, som blant annet har utviklet området rundt Mathallen i Oslo, eier bygningen sammen med Strawberry Brothers (Petter Stordalen og Varner Invest) og Høegh Eiendom. Under Landmarks føtter blir det 250 hotellrom, flere restauranter og barer. Bak ryggen hans kommer byens første taksvømmebasseng.</p> <p>De har planer også for bygningene rundt: Tilbygget fra 1960-tallet på baksiden skal rives og erstattes med en ny bygning, der det blir tre leilighetstårn og hotell i første etasje. I det tilstøtende ambassadebygget fra 1870 i Inkognitogata, med fantastisk takhøyde, gigantiske takrosetter og balkonger, blir det 21 suiter, og restaurant under hvelvene i kjelleren. I trekantområdet mellom bygningene blir det et grøntområde – en piazza – med underjordisk klubb og konsertscene for 700 mennesker, og inngang til Vestkantbadet, som pusses opp.</p> <p>– Det blir en veldig kompleks omvandling, sier Landmark.</p> <p>– Mye har handlet om hva vi skal ta vare på, og hva vi skal rive. Først tenkte vi å ta vekk flere ting. Men mer og mer er blitt tatt vare på. Vi hadde for eksempel andre planer for den tidligere kantinen, men skjønte at bildene der var laget av Per Krohg. Og da måtte vi selvsagt ta vare på dem.</p> <p>Det som tilføres, skal ikke se dønn nytt ut, forteller han.</p> <p>– Det skal se ut som om vi fullfører det arkitektene begynte på den gangen. Slik kvartalet en gang var tenkt.</p> <p>Han går litt nærmere kanten på takterrassen.</p> <p>– Og hvis Stordalen får det som han vil, blir det grøntområde med masse uteplasser der nede, utenfor hotellet. I stedet for asfalt.</p> <div class=\"dn-relation-block\">  <strong>Les også:</strong>  <link href=\"/v1/content/2-1-370783\" rel=\"inline\" source=\"drpublish\" ref=\"38\" /> </div> <link href=\"/v1/content/2-1-091e5a10a3bc753f2aab8b188640940f\" rel=\"inline\" source=\"drpublish\" ref=\"14\" /> <p class=\"subhead\" data-element-type=\"subhead\">Modigere prosjekter. Det er sent i 2005. Petter Stordalen rangler over Drottningtorget i Göteborg – og blir stående. Han har vært på fest med en av sine administrerende direktører, han er i godt humør, og nå peker han på en gigantisk steinbygning med kolonner og staselige trapper.</p> <p>«Det er faenmeg et hotell», sier Stordalen. «Nej, det är det gamla posthuset», sier direktøren. «Kjøp det!» «Nej, nej, nej – börja inte med det nu.» «Jo, kjøp det!»</p> <p>– Frem til da hadde hotellene bare vært til for gjestene, sier Stordalen.</p> <p>– Men jeg hadde begynt å kjenne på ideen om å lage noe mer – et nabolagshotell, nei, et hotell som skulle være for alle. Jeg vil ikke bare bygge hoteller. Jeg vil forandre bybildet.</p> <link href=\"/v1/content/2-1-863062925dd153832786b830ec7e95df\" rel=\"inline\" source=\"drpublish\" ref=\"27\" /> <link href=\"/v1/content/2-1-d190a04c778fd93d06cd55e3fe260bcf\" rel=\"inline\" source=\"drpublish\" ref=\"32\" /> <link href=\"/v1/content/2-1-96a89e2e03572e2fc91ebb37499c7062\" rel=\"inline\" source=\"drpublish\" ref=\"15\" /> <p class=\"subhead\" data-element-type=\"subhead\">Tidlig ute. Four Seasons, Hilton og Sheraton. En gang i tiden var det disse hotellene som sto øverst på listen når herr og fru middelklasse tok en ferietur. De store kjedene sto for trygghet, a home away from home, man visste hva man fikk. Men da Bill Kimpton åpnet sitt første hotell i San Francisco i 1981, var tanken å bruke gamle bygninger, gjerne på uventede steder, og gjerne med en hyggelig restaurant.</p> <p>I 1984 startet Ian Schrager og Steve Rubell det som ofte beskrives som det første boutiquehotellet, Morgans i New York. Duoen ville blande kulturell og økonomisk kapital, lobbyen skulle være en sosial arena og hotellet et reisemål i seg selv. Ti år senere, med begrepet designhotell på plass, åpnet Schrager Delano South Beach i en art deco-bygning fra 1947 i Miami og introduserte begrepet urban resorts, hoteller som hadde alt gjesten trenger for ikke å forlate det.</p> <p>– Jeg husker at jeg sjekket inn der, og at det var første gang jeg ble blåst av banen av et hotell. Det var et helt unikt hotell i et historisk bygg, og det ga meg en helt ny opplevelse, sier Petter Stordalen.</p> <p>Da han gikk inn i hotellbransjen i 1996, ved å kjøpe 68 prosent av aksjene i Choice Hotels Scandinavia, var det de store, trygge kjedene – Rica, Sas og Scandic – som regjerte. Hans eget selskap var «relativt lite toppstyrt», mange reiste mye, og de begynte å se noen trender som åpnet for nye muligheter.</p> <p>– Men det var først da jeg fikk kjøpt posthuset i Göteborg, som sto ferdig i 2012, at ideen virkelig tok fart.</p> <p>Stordalen lener seg frem:</p> <p>– Vi så at 50 prosent av dem som var på Clarion Hotel Post, ikke bodde på hotellet. De kom for å spise eller henge ut i baren. Vi så at flere ønsket unike hoteller. Vi startet Nordic Hotels &amp; Resorts. Og etter The Thief var vi modne for enda større og modigere prosjekter.</p> <div class=\"dn-relation-block\">  <strong>Les også:</strong>  <link href=\"/v1/content/2-1-264762\" rel=\"inline\" source=\"drpublish\" ref=\"39\" /> </div> <link href=\"/v1/content/2-1-03161a256d1689fcb3113d6a12dcc432\" rel=\"inline\" source=\"drpublish\" ref=\"16\" /> <p class=\"subhead\" data-element-type=\"subhead\">Overdådig. – Første gang jeg så dette bygget? Jeg var overveldet. Det var både inspirerende og skremmende.</p> <p>Interiørdesigner Alice Lund (34) står midt i Londons finansdistrikt, utenfor hotellet The Ned, som hun og kollegaen Adam Greco (32) brukte fem år på å innrede. Etter at det åpnet i fjor, ble det kåret til «årets hotell» under bransjekåringen Ahead Awards, der de også vant i kategoriene «spa og velvære» og «restaurant og selskapslokale».</p> <p>I 2012 hadde gamle Midland Bank, på nesten 30.000 m², stått tom i åtte år. 1939-bygningen, som er tegnet av arkitekten sir Edwin Lutyens – også kjent for å stå bak planleggingen av New Delhi – hadde den strengeste formen for vern. Nick Jones, som eier The Ned sammen med Sydell Group, gikk bare på befaring av høflighet. «Det er sjelden du får mulighet til å jobbe med en bygning av Lutyens. Her fikk vi både historie og vakker arkitektur, men en vernet bygning kan også være vanskelig å jobbe med. Vi fikk ikke lov til å flytte på noe – inkludert 92 grønne steinkolonner og over 100 skranker i tre», skriver Jones i en epost til D2.</p> <p>Det første man tenker på inne på The Ned, er størrelsen: et åpent rom på 3000 m², der skrankene deler opp rommet i bar- og restaurantsoner og små kroker der man kan være i fred. Det er ettermiddag og stappfullt av mennesker som spiser, drikker, har møter – her kan 850 mennesker få plass samtidig.</p> <link href=\"/v1/content/2-1-15c48bf4469e1abd8f079240d0299a18\" rel=\"inline\" source=\"drpublish\" ref=\"28\" /> <link href=\"/v1/content/2-1-4182a0e2a17a925c6c6449f59070ab00\" rel=\"inline\" source=\"drpublish\" ref=\"33\" /> <link href=\"/v1/content/2-1-18dfe9506ce6c791f2b8cfc7d3459baa\" rel=\"inline\" source=\"drpublish\" ref=\"17\" /> <p>I taket henger 70 reproduserte lysekroner over fløyel, mørkt tre og messing. «Den høytidelige, edvardianske storslagenheten er blitt myknet opp og gjort sexy», som en anmelder skrev. Og på en scene, midt i det hele, står en dame og synger Joni Mitchell.</p> <p>– Det er et overdådig lokale, men det skulle være et sted for alle, ikke bare finanseliten. Vi ville skape en hyggelig og intim atmosfære, sier Alice Lund.</p> <p>Alt fra tapeter og sofaer, stoler, bord, nattbord, speil og lamper, tepper og tekstiler – helt ned til mønsteret på det tynne papiret bak rasteret i resepsjonsskranken – er laget av designduoen.</p> <p>– 70 prosent ble tegnet av firmaet vårt, GrecoDeco, og spesiallaget til hotellet, ti prosent er vintage-objekter håndplukket av oss, og 20 prosent, som badekar og servanter, er nyprodusert, sier Lund.</p> <link href=\"/v1/content/2-1-4df4765d98285be6b00552b5115ec881\" rel=\"inline\" source=\"drpublish\" ref=\"18\" /> <p>I kjelleren er det medlemsklubb, håndmalte vegger i gull som tolker oppdageren Thomas Cooks reiser. I det tidligere gullbarrehvelvet er det blitt svømmebasseng, og i hvelvet der de 3000 skinnende bankboksene fortsatt dekker veggene, er det nå klubblokale.</p> <p>– Du må være veldig ydmyk i et slikt prosjekt, sier hun.</p> <p>– Vi pleide ofte å se på hverandre og si: «Hva ville Lutyens ha gjort?»</p> <p>Nå skal duoen bruke de neste tre årene på å innrede Sommerro i Oslo.</p> <div class=\"dn-relation-block\">  <strong>Les også:</strong>  <link href=\"/v1/content/2-1-261419\" rel=\"inline\" source=\"drpublish\" ref=\"40\" /> </div> <link href=\"/v1/content/2-1-0761ad6b1182bd7c27c79478f97a2437\" rel=\"inline\" source=\"drpublish\" ref=\"19\" /> <link href=\"/v1/content/2-1-646c030c508374636b39f3909ac35050\" rel=\"inline\" source=\"drpublish\" ref=\"34\" /> <p class=\"subhead\" data-element-type=\"subhead\">Gjennomført. De har vært i Bergen, Ålesund og Sykkylven, overnattet i tømmerhytte, besøkt kraftstasjonen Sauda III, tegnet av Bjercke og Eliassen, gått på museer, lest gamle møbelkataloger, studert bilder av Oslo Lysverker.</p> <p>Alice Lund og Adam Greco har gjort sin research – og landet på fire inspirasjonskilder: norske møbler fra 1900–1940 (unike detaljer som de ikke har sett ellers i Skandinavia), Oslo rådhus (som de mener er det mest imponerende bygget i Norge og virkelig viser hva interiørdesign kan være), kunstneren Gerhard Munthe (fargene og mønstrene) og skandinavisk art deco og europeisk funksjonalisme.</p> <div id=\"promobox-1536664653670\" data-promobox-value=\"%7B%22template%22%3A%22Nyhetsbrev%20D2%22%2C%22publication%22%3A%22feature%22%2C%22design%22%3A%22Left%20Align%22%2C%22title%22%3A%22Ikke%20g%C3%A5%20glipp%20av%20noe!%22%2C%22selectedImage%22%3A%22%22%2C%22hideImage%22%3Afalse%2C%22text%22%3A%22F%C3%A5%20ukebrev%20med%20D2s%20beste%20saker%20rett%20i%20innboksen.%22%2C%22buttonLabel%22%3A%22Meld%20deg%20p%C3%A5%20her%22%2C%22url%22%3A%22https%3A%2F%2Fwww.dn.no%2Fkundeservice%2Fnyhetsbrev%22%7D\" class=\"dp-plugin-element dp-plugin-promobox\" data-ah5-type=\"promobox\">  PromoBox : Ikke gå glipp av noe! </div> <p>– Mange utlendinger kjenner til skandinavisk design, men vet ingenting om norsk design, og i hvert fall ingenting utover 1950- og 1960-tallet, sier Adam Greco.</p> <p>– Om det er en fordel for oss? Jeg tror kanskje at vi ser alt med friske øyne, ting dere ikke tenker på som vakkert eller unikt, fordi det er en del av kulturen deres, eller fordi dere ser det hver dag. Vi ønsker å lage et interiør som føles norsk, uten å støtte seg på klisjeer.</p> <p>Han stopper ved det som en gang var kontoret til generaldirektøren i Oslo Lysverker.</p> <p>Alle veggene er av nøttetre. I midten står et tungt skrivebord. Det er som å reise tilbake i tid.</p> <p>– Dette er det fineste rommet i hele bygningen, sier han.</p> <p>– Du kan nesten ikke skjønne at det fortsatt står her. Slike veggpaneler har vi aldri har sett før, hverken i England eller Amerika. Vi tenker at det må bli en suite.</p> <p>Alice Lund nikker.</p> <p>– Jeg er desperat etter å komme inn i hvert eneste lille rom når folk flytter ut rundt nyttår, og begynne å utforske bygget på ordentlig, sier hun.</p> <p></p> <blockquote itemscope=\"\" itemtype=\"http://schema.org/Quotation\" class=\"duplicate\">  <p itemprop=\"text\" style=\"text-align: center;\">Jeg er desperat etter å komme inn i hvert eneste lille rom når folk flytter ut</p>  <p itemprop=\"creator\" style=\"text-align: center;\">Alice Lund – interiørarkitekt</p> </blockquote> <p></p> <p>– Det å tilbakestille Sommerro handler ikke om å romantisere fortiden. Det handler om å respektere denne vakre bygningen. Derfor kommer vi til å jobbe utrolig mye med detaljene. Ingenting skal trekke deg ut av illusjonen om at det er sånn det alltid har sett ut.</p> <div class=\"dn-relation-block\">  <strong>Les også:</strong>  <link href=\"/v1/content/2-1-355887\" rel=\"inline\" source=\"drpublish\" ref=\"41\" /> </div> <p class=\"subhead\" data-element-type=\"subhead\">Lys og varme. – Vi så mulighetene, og tenkte: «Yes. Dette kan bli fint», sier Gunnar Bøyum, administrerende direktør i eiendomsselskapet Aspelin Ramm, om den dagen han tok med Stordalen for å se på Oslo Lysverker i Sommerrogata.</p> <p>– Og noen ganger skal du kanskje gjøre det som føles bra i hjertet og er best for byen.</p> <p>Bygget var tegnet av nevnte Bjercke og Eliassen, som også sto bak Sjømannsskolen på Ekeberg og Den norske Amerikalinjes kontorbygg på Jernbanetorget – for øvrig det første norske bygget med aircondition. I en artikkel i bladet Byggekunst fra 1932 står det at arbeidet i Sommerrogata «ble ført frem under meget vanskelige forhold», teknisk, økonomisk og logistisk. Noen av tingene arkitektene tegnet, ble aldri bygget.</p> <link href=\"/v1/content/2-1-935d942720290f2dda27f672e29bed0a\" rel=\"inline\" source=\"drpublish\" ref=\"20\" /> <p>Men i 1931 sto Sommerrogata 1 der: et svakt buet bygg, i italiensk inspirert nyklassisisme, med utsikt mot fjorden. På pilarene ved hovedinngangen viser 24 relieffer av billedhuggeren Asbjørg Borgfelt damer og menn i arbeid. Innenfor dørene er de gamle lysarmaturene og klokken fortsatt bevart, i midten av det spiralformede trappeløpet henger Oslos kanskje lengste lampe – og den skal få henge.</p> <p>Rom skal slås sammen for å bli mer praktiske, ventilasjon, lys, elektrisitet og brannsikkerhet må på plass. Oslo Lysverker står på Byantikvarens gule liste, men bygget er fredningsverdig og blir behandlet som det.</p> <p>– Det handler om å gi og ta, sier byantikvar Janne Wilberg.</p> <p>– Vi elsker gode prosesser, og vil også gjerne kunne være stolte av bygget og hva vi har fått til sammen med eier den dagen det åpner.</p> <p>Eierne ville for eksempel rive rommet med Per Krohgs fresker. «Det blir det kamp om», sa vi. Det er meget viktig for oss. Ellers er dette en utbygger vi har samarbeidet med før, og det er mye vi har vært enige om fra start. Som at Vestkantbadet skal bevares og være tilgjengelig for alle.</p> <link href=\"/v1/content/2-1-f7aa8a6861fb151729a7194aa37ed4e0\" rel=\"inline\" source=\"drpublish\" ref=\"21\" /> <p>Eksempler på ting byantikvaren mener det er viktig å bevare, er de historiske interiørene, trappeløpene, lampen, resepsjonen og Per Krohgs verk i den store salen.</p> <p>– Det er høy klasse på alt av originale detaljer, og vi anbefaler sterkt at man tar med seg disse kvalitetene i nybygget, for å skape en helhet. Det kan handle om alt fra nummereringen av rommene til håndtakene på dørene.</p> <p>Å frede bygget er på nåværende tidspunkt ikke aktuelt.</p> <p>– Ikke så lenge vi har en god og løpende prosess med utbygger om hva og hvordan tingene skal gjøres.</p> <p>Ifølge avdelingsdirektør hos Riksantikvaren, Hanna Geiran, er det viktigste når man gjør om slike gamle bygninger, å ta vare på det som er unikt.</p> <p>– Riksantikvaren og Byantikvaren har litt ulike roller, men på generelt grunnlag synes vi at vern gjennom bruk, det vil si at man bruker gamle bygninger, er kjempebra, sier Geiran.</p> <div class=\"dn-relation-block\">  <strong>Les også:</strong>  <link href=\"/v1/content/2-1-320978\" rel=\"inline\" source=\"drpublish\" ref=\"42\" /> </div> <link href=\"/v1/content/2-1-3fa67443b282be7baf2b2b99b8b5bacf\" rel=\"inline\" source=\"drpublish\" ref=\"29\" /> <link href=\"/v1/content/2-1-4016e533086f018977cb78580442b02c\" rel=\"inline\" source=\"drpublish\" ref=\"35\" /> <link href=\"/v1/content/2-1-20a06d7a78d904666cf3ca388c42d59b\" rel=\"inline\" source=\"drpublish\" ref=\"22\" /> <p class=\"subhead\" data-element-type=\"subhead\">Erfaring. På Vestkantbadet kommer en mann i Speedo ut i svømme­hallen mens Petter Stordalen fotograferes.</p> <p>– Du må ikke forandre det som er så bra her, sier mannen.</p> <p>– Vi skal gjøre det bedre, sier Stordalen.</p> <p>– Men du må ikke forandre for mye, da.</p> <p>– Vi skal spandere to milliarder, det er klart det kommer til å bli bra! sier Stordalen.</p> <p>Han har gjort lignende prosjekter tidligere: For noen år siden var Brunkebergstorg en øde plass i sentrum av Stockholm. Kontorer. Betong. Prostitusjon. Da en av bankbygningene skulle selges, var likevel 70 lokale og internasjonale hotellkjeder interessert.</p> <p>– Kontorene og bankene hadde ødelagt stedet. Etter stengetid var det dødt. Men se på det nå. Et hotell lever hele døgnet, 365 dager i året. Så får du ketchupeffekten. De første som flyttet inn i området, var Spotify, sier Stordalen.</p> <p>Nå er det fontener, grønne trær og utesteder på Brunkebergstorg. På de to takterrassene til Hotel At Six, forbundet med en bro inspirert av The High Line i New York, kan det være 7000 mennesker på en kveld. Budsjettet var på 225 millioner – men det har det kostet en halv milliard.</p> <p>– Vi tapte 70 millioner da det åpnet i fjor, det var det eneste avisene skrev om, og det er det de vil skrive om når Sommerro åpner. Men da la vi på 100 millioner til. Og nå sitter jeg her og planlegger et tredje – og et fjerde – tak!</p> <p></p> <blockquote itemscope=\"\" itemtype=\"http://schema.org/Quotation\" class=\"duplicate\">  <p itemprop=\"text\" style=\"text-align: center;\">Vi tapte 70 millioner da det åpnet i fjor, det var det eneste avisene skrev om, og det er det de vil skrive om når Sommerro åpner</p>  <p itemprop=\"creator\" style=\"text-align: center;\">Petter Stordalen – hotelleier og investor</p> </blockquote> <p></p> <p>Stordalen smiler.</p> <p>– Jeg aner ikke hvilken avkastning Sommerrogata kommer til å få, men jeg vet at den kommer til å bli veldig lav. Det kan jeg si med 100 prosent sikkerhet. Hadde vi tenkt med kalkulatoren, ville vi laget kontorer. Dette blir ikke noe du viser frem til banken og er veldig stolt av.</p> <link href=\"/v1/content/2-1-89281c3c955dbd3323c1856b29b4eee7\" rel=\"inline\" source=\"drpublish\" ref=\"36\" /> <link href=\"/v1/content/2-1-eb93deb656aa45945bf3768e692f5162\" rel=\"inline\" source=\"drpublish\" ref=\"23\" /> <link href=\"/v1/content/2-1-50fde23bb8d0126c33e2d6f8251cebc1\" rel=\"inline\" source=\"drpublish\" ref=\"24\" /> <p class=\"subhead\" data-element-type=\"subhead\">Gentrifisering. Det sies at The Ace forandret Hoxton i Øst-London, mens The Ned revitaliserte byens finansdistrikt. Vil Sommerro gjør det samme med Frogner – og bli den «vitamin­injeksjonen» og «storstuen» Stordalen og hans samarbeidspartnere for seg?</p> <p>– En bekymring som ofte dukker opp i kjølvannet av denne bølgen, er gentrifiseringen. Disse hotellene får ofte kred for å transformere hele nabolag. Men det er ikke nødvendigvis til det bedre for alle, sier Skift-redaktør Deanna Ting.</p> <p>Erling Dokk Holm, førsteamanuensis ved Høyskolen Kristiania og mangeårig byutviklingskommentator, synes ikke det er noe problem:</p> <p>– Det er bra at vi får en rekke forskjellige næringer i en by, det som er problematisk er hvis du får rene boligstrøk, næringsstrøk eller kontorstrøk – og slik er det jo litt i Vika nå, det skjer ikke så mye etter stengetid. Det overordnede prinsippet for en vellykket by er funksjonsblanding, det bidrar til trøkk i gatene.</p> <p>Så kan man jo spørre seg hvor autentisk det er å pusse opp gamle bygg for å skape en illusjon av ekthet.</p> <p>– Hva er alternativet? At disse bygningene ikke blir leid ut? At de står og forfaller? sier Gunnar Bøyum i Aspelin Ramm.</p> <p></p> <blockquote itemscope=\"\" itemtype=\"http://schema.org/Quotation\" class=\"duplicate\">  <p itemprop=\"text\" style=\"text-align: center;\">Hva er ­alternativet? At disse bygningene ikke blir leid ut? At de står og forfaller?</p>  <p itemprop=\"creator\" style=\"text-align: center;\">Gunnar Bøyum – adm.dir. i Aspelin Ramm</p> </blockquote> <p></p> <p>Som i nesten alle byggesaker har det vært noen kritiske kommentarer fra naboer om høyden på boligbygget, forteller Bøyum, men siden plan og bygningsetaten ønsker flere boliger i sentrum, er de ikke tatt til følge. Stordalen har snakket om å legge ned gaten foran hotellet.</p> <p>– Om det er vanskelig å legge ned en gate? Ja, det er vel ikke noe vi gjør til daglig, sier Bøyum og ler.</p> <p>– Men vi er opptatt av å gi noe tilbake til byen. Hvis du tar fra folk en gate, da må du gi noe fint tilbake, da, som trær, utesteder og sykkelsti.</p> <div class=\"dn-relation-block\">  <strong>Les også:</strong>  <link href=\"/v1/content/2-1-291473\" rel=\"inline\" source=\"drpublish\" ref=\"43\" /> </div> <p class=\"subhead\" data-element-type=\"subhead\">Ettermæle. Petter Stordalen fikler med en quinoasalat. Han sier at dette bare er starten: I fremtiden vil alle de store hotellkjedene være multi-merkevarer, vi vil få enda flere unike hotellkonsepter, som ikke vil assosieres med – men kontrolleres av – de store kjedene.</p> <p>– Min ambisjon er ikke å løpe fortest mulig, sier han.</p> <p>– Vi skal tjene passe mye penger, ha det ekstremt moro på veien og gjøre ting som definerer oss som hotellselskap.</p> <p>Han nikker.</p> <p>– Ingen kommer til å huske at jeg sto bak to gigantiske flyplasshoteller. Det som vil stå igjen, er disse unike gamle byggene og hvordan de forandret området rundt.</p> <p dir=\"ltr\"><span id=\"docs-internal-guid-68736f9e-7fff-2737-57e7-b73dded4fd1a\"></span></p> <p>* </p></div>";
		//String html = "<ul><li>Etablert da Nasdaq i 2008 kjøpte Nord Pool Clearing og, Nord Pool Consulting og dannet råvarebørsen Nasdaq OMX, som nå heter Nasdaq Oslo. Dermed ble de to markedene for fysisk og finansiell krafthandel adskilt. </li><li>Råvarebørsen Nasdaq Oslo omsetter finansielle derivater for krafthandel</li><li>Råvarebørsen har sete på Skøyen i Oslo, mens søsterselskapet Nasdaq Clearing ligger i Stockholm</li><li>Clearinghuset er en oppgjørssentral som stiller garanti for oppgjør for begge parter i en handel, og står med risikoen dersom en part ikke kan gjøre opp. </li><li>Einar Aas' tap påførte clearinghuset et tap på 1,1 milliarder kroner. Dermed gikk det første sikringsfondet Junior Capital på 70 millioner svenske kroner fløyten. Av sikringsfondet på 1,7 milliarder svenske kroner, må medlemmene skyte inn over en milliard kroner. Det fantes ytterligere to sikringsfond på henholdsvis 200 og 480 millioner svenske kroner.</li></ul>";
		
		JsoupTester jsoupTester = new JsoupTester();
		
		// System.out.println(jsoupTester.getSingleNodeIfMultiple(html));;
		
		//System.out.println("RESULY" + jsoupTester.getBodyContent(jsoupTester.getSingleNodeIfMultiple(html)));
		
		System.out.println(jsoupTester.getNewLanternContentProcessed(html));
		
		//System.out.println(jsoupTester.getBodyContent(html).equalsIgnoreCase(jsoupTester.getLanternContentProcessed(html)));
	}
	
	public String getNewLanternContentProcessed(String html)
	{
		String content = "";

        Document doc = Jsoup.parseBodyFragment(html);
        doc.outputSettings().escapeMode(Entities.EscapeMode.xhtml);
        doc.outputSettings().prettyPrint(false);

        // getting the body content as element
        Element element = doc.getElementsByTag("body").get(0).child(0);
        
        // getting the first node of body
        Node firstNode = doc.getElementsByTag("body").get(0).childNode(0);
        
        // if body content wrapped inside a single div tag
        if (doc.getElementsByTag("body").get(0).childNodeSize() == 1
        		&& firstNode.nodeName().equalsIgnoreCase("div")) {
            element.attr("id", "root");		
        } 
        
        // if the body contains multiple tag (not a sing tag) 
        // & if wrapped by a single tag but it is not div
        else {
            element = doc.createElement("div");
            element.attr("id", "root");
            element.append(html);
        }
        
        // wrap the whole body content inside a new div tag (for future removal of the initial tag)
        Element elementToRemove = doc.createElement("div");
        elementToRemove.attr("id", "element-to-remove");
        elementToRemove.appendChild(element);
        content = elementToRemove.html().replaceAll("\n", "");
        content = content.replaceAll("<iframe([^<]*)/>", "<iframe $1></iframe>");
        
        return content;
	}
	
	public String getLanternContentProcessed(String html) 
	{
		String content = "";

        //String cleanHtml = Jsoup.clean(html, new Whitelist());
        Document doc = Jsoup.parseBodyFragment(html);
        doc.outputSettings().escapeMode(Entities.EscapeMode.xhtml);
        doc.outputSettings().prettyPrint(false);

        Element element;
        if (doc.getElementsByTag("body").get(0).childNodeSize() == 1) {
            element = doc.getElementsByTag("body").get(0).lastElementSibling();
            element.attr("id", "root");
        } else {
            element = doc.createElement("div");
            element.attr("id", "root");
            element.append(html);
        }

        Element elementToRemove = doc.createElement("div");
        elementToRemove.attr("id", "element-to-remove");
        elementToRemove.appendChild(element);

        content = elementToRemove.html().replaceAll("\n", "");

        //content.replaceAll("\n", "");
        content = content.replaceAll("<iframe([^<]*)/>", "<iframe $1></iframe>");
        return content;
	}
	
	public String getSingleNodeIfMultiple(String html) 
	{
		Document doc = Jsoup.parseBodyFragment(html);
		Jsoup.clean(html, new Whitelist());
		doc.outputSettings().escapeMode(Entities.EscapeMode.xhtml);
		doc.outputSettings().prettyPrint(false);
		if (doc.getElementsByTag("body").get(0).childNodeSize() == 1) {
			return html;
		} else {
			Element div = doc.createElement("div");
			div.attr("id", "something");
			div.append(html);
			
			Element div2 = doc.createElement("div");
			div2.attr("id", "another");
			div2.appendChild(div);

		    return div2.html().replaceAll("\n", "");
		}
	}
	
	public String getBodyContent(String html)
    {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(new InputSource(
                    new StringReader(html)));
            org.w3c.dom.Element element = document.getDocumentElement();
            return getBodyContent(element);
        } catch (Exception e) {
            System.out.println("You have got an exception"+ e);
        }
        return "";
    }
	
	private String getBodyContent(org.w3c.dom.Element element)
            throws TransformerException
    {
        String content = "";
        if (element == null) {
            return content;
        }
        String tagName = element.getTagName();
        if (!tagName.equalsIgnoreCase("div")) {
            org.w3c.dom.Element div = element.getOwnerDocument().createElement("div");
            div.appendChild(element);
            return getProcessedElement(div, content);
        }
        return getProcessedElement(element, content);
    }
	
	public String getProcessedElement(org.w3c.dom.Element div, String content)
            throws TransformerException
    {
        div.setAttribute("id", "root");
        TransformerFactory transFactory = TransformerFactory.newInstance();
        Transformer transformer = transFactory.newTransformer();
        StringWriter buffer = new StringWriter();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.transform(new DOMSource(div), new StreamResult(buffer));
        content = buffer.toString();
        content = content.replaceAll("<iframe([^<]*)/>", "<iframe $1></iframe>");
        return content;
    }

}
