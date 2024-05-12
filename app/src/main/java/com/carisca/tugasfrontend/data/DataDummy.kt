package com.carisca.tugasfrontend.data

import com.carisca.tugasfrontend.R
import com.carisca.tugasfrontend.model.Artis
import com.carisca.tugasfrontend.model.Album

object DataDummy {
    val AllArtis = listOf(
        Artis(
            id = 1,
            name = "Seventeen",
            about = "Racking up 2 billion streams and selling 10 million albums, " +
                    "SEVENTEEN—comprised of S.COUPS, JEONGHAN, JOSHUA, JUN, HOSHI, WONWOO, WOOZI, THE 8, MINGYU, DK, SEUNGKWAN, VERNON and DINO—have rocketed to the forefront of the music " +
                    "scene fueled by a fiercely independent spirit and a nonpareil in-house creative ecosystem. ",
            photo = R.drawable.seventeen
        ),
        Artis(
            id = 2,
            name = "Boynextdoor",
            about = "Aspiring to bring music and lyrics that will resonate with everyone, BOYNEXTDOOR (SUNGHO, RIWOO, JAEHYUN, TAESAN, LEEHAN, WOONHAK) debuted in May 2023 with their highly-anticipated single album WHO!. " +
                    "2nd EP HOW? acts as a bridge between the sextet’s debut single album WHO! and their 1st EP WHY.., 2nd EP HOW? completes their first-love-trilogy.",
            photo = R.drawable.boynextdoor
        ),
        Artis(
            id = 3,
            name = "Newjeans",
            about = "NewJeans (MINJI, HANNI, DANIELLE, HAERIN, and HYEIN) debuted on July 22, 2022, as ADOR's first group, an independent label under HYBE led by Hee Jin Min. " +
                    "The quintet aspires to push the limits of K-pop with honest and authentic music that exudes youth. " +
                    "Just like a pair of jeans that has been a wardrobe staple for generations, NewJeans aims to allure its listeners with timeless music.",
            photo = R.drawable.newjeans
        ),
        Artis(
            id = 4,
            name = "NCTDREAM",
            about = "NCT DREAM, a popular sub-group within the NCT brand, debuted in August 2016 with the bright, " +
                    "bubbly single ‘Chewing Gum’. Since then, NCT DREAM has released a wide variety of songs including ‘My First and Last’, ‘We Young’, ‘GO’, and ‘We Go Up’, " +
                    "presenting music and performances only teens can express, full of a wide range of emotions and images.",
            photo = R.drawable.nctdream
        ),
        Artis(
            id = 5,
            name = "Ariana Grande",
            about = "With her four-octave vocal acrobatics and iconic image, American singer, songwriter, and actress " +
                    "Ariana Grande has solidified her place as one of the quintessential pop stars of her generation, " +
                    "racking up stacks of awards and chart records in the process. " +
                    "Emerging in the early 2010s with the hit single The Way, Grande was primed to follow in the footsteps of her biggest influences.",
            photo = R.drawable.ariana
        ),
        Artis(
            id = 6,
            name = "BTS",
            about = "Record-breaking South Korean boy band BTS deliver an energetic blend of dance-pop and hip-hop with deeply " +
                    "introspective lyrics that helped them build a devoted global following while also making them one of the most successful " +
                    "Korean exports in the world. Debuting in the early 2010s with their Skool trilogy.",
            photo = R.drawable.bts
        ),
        Artis(
            id = 7,
            name = "IVE",
            about = "South Korea's IVE is an all-girl pop outfit known for their hooky, dance-oriented sound. " +
                    "The group debuted to major success, topping the Gaon charts",
            photo = R.drawable.ive
        ),
        Artis(
            id = 8,
            name = "Taylor Swift",
            about = "All’s fair in love and poetry… New album THE TORTURED POETS DEPARTMENT. Out now",
            photo = R.drawable.taylor
        ),
        Artis(
            id = 9,
            name = "Bruno Mars",
            about = "11x time GRAMMY Award winner Bruno Mars is one of the best-selling artists of all time. " +
                    "DOO-WOPS & HOOLIGANS marked the landmark debut of a remarkable new artist. " +
                    "The album – which peaked at #3 on the Billboard 200 – has gone on to achieve global album equivalent sales of 15.5 million.",
            photo = R.drawable.bruno
        ),
        Artis(
            id = 10,
            name = "One Direction",
            about = "Following the success of JLS and the Wanted, " +
                    "X-Factor contestants One Direction were the next group of heartthrobs to help revive the boy band concept.",
            photo = R.drawable.one
        ),
        Artis(
            id = 11,
            name = "Somi",
            about = "She first appeared in the public eye at the young age of 12 on various TV and film projects " +
                    "and has seen momentum build throughout her young career. " +
                    "She took the spotlight on the reality competition show ‘PRODUCE 101’ where she rose to stardom after finishing in " +
                    "1st place by popular fan vote and was nicknamed ‘The Nation’s Center’.",
            photo = R.drawable.somi
        ),
        Artis(
            id = 12,
            name = "Zico",
            about = "ZICO is a chart-topping singer, rapper, and music producer under his own label KOZ, " +
                    "leading the trend of the ever-changing Korean music industry.",
            photo = R.drawable.zico
        )
    )

    val AllAlbum = listOf(
        Album(
            id = 1,
            name = "HOW?",
            year = 2024,
            photo = R.drawable.how,
            song1 = "OUR",
            song2 = "Amnesia",
            song3 = "So let's go see the stars",
            song4 = "Earth, Wind & Fire",
            song5 = "lifeiscool",
            artisname = "Boynextdoor"
        ),
        Album(
            id = 2,
            name = "Lover",
            year = 2019,
            photo = R.drawable.lover,
            song1 = "I Forgot That You Existed",
            song2 = "Cruel Summer",
            song3 = "Lover",
            song4 = "The Man",
            song5 = "The Archer",
            artisname = "Taylor Swift"
        ),
        Album(
            id = 3,
            name = "Hello Future",
            year = 2022,
            photo = R.drawable.hellofuture,
            song1 = "Hello Future",
            song2 = "Bungee",
            song3 = "Hot Sauce",
            song4 = "Diggity",
            song5 = "Life Is Still Going On",
            artisname = "NCTDREAM"
        ),
        Album(
            id = 4,
            name = "Melodies",
            year = 2023,
            photo = R.drawable.broken,
            song1 = "Broken Melodies",
            song2 = "Graduation",
            song3 = "Take My Breath",
            song4 = "Moon",
            song5 = "Walk With You",
            artisname = "NCTDREAM"
        ),
        Album(
            id = 5,
            name = "Eternal",
            year = 2024,
            photo = R.drawable.eternal,
            song1 = "intro(end of the world)",
            song2 = "bye",
            song3 = "don't wanna break up again",
            song4 = "we can't be friends",
            song5 = "eternal sunshine",
            artisname = "Ariana Grande"
        ),
        Album(
            id = 6,
            name = "Heaven",
            year = 2023,
            photo = R.drawable.heaven,
            song1 = "SOS",
            song2 = "God of Music",
            song3 = "Diamond Days",
            song4 = "Monster",
            song5 = "Yawn",
            artisname = "Seventeen"
        ),
        Album(
            id = 7,
            name = "FML",
            year = 2022,
            photo = R.drawable.fml,
            song1 = "Super",
            song2 = "Fire",
            song3 = "I Don't Understand But I Luv U",
            song4 = "Dust",
            song5 = "April Shower",
            artisname = "Seventeen"
        ),
        Album(
            id = 8,
            name = "Game Plan",
            year = 2021,
            photo = R.drawable.gameplan,
            song1 = "Gold Gold Gold",
            song2 = "Fast Forward",
            song3 = "Fxxked Up",
            song4 = "Pisces",
            song5 = "The Way",
            artisname = "Somi"
        ),
        Album(
            id = 9,
            name = "SPOT!",
            year = 2024,
            photo = R.drawable.spot,
            song1 = "SPOT!",
            song2 = "Any Song",
            song3 = "Okay Dokey",
            song4 = "New Thing",
            song5 = "SoulMate",
            artisname = "Zico"
        ),
        Album(
            id = 10,
            name = "New Jeans",
            year = 2022,
            photo = R.drawable.partone,
            song1 = "Attention",
            song2 = "Hype Boy",
            song3 = "Cookie",
            song4 = "Hurt",
            song5 = "Ditto",
            artisname = "Newjeans"
        )
    )
}