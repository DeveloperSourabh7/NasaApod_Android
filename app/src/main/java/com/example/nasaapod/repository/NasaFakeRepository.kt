package com.example.nasaapod.repository

import persistent.app.mynasa.DataClassModel.MyNasa

class NasaFakeRepository {
    fun getAllData(): List<MyNasa> {
        return listOf(
            MyNasa(
                date = "1997-11-30",
                explanation = "Mercury's surface looks similar to our Moon's. Each is heavily cratered and made of rock.  Mercury's diameter is about 4800 km, while the Moon's is slightly less at about 3500 km (compared with about 12,700 km for the Earth). But Mercury is unique in many ways.  Mercury is the closest planet to the Sun, orbiting at about 1/3 the radius of the Earth's orbit. As Mercury slowly rotates, its surface temperature varies from an unbearably cold -180 degrees Celsius to an unbearably hot 400 degrees Celsius. The place nearest the Sun in Mercury's orbit changes slightly each orbit - a fact used by Albert Einstein to help verify the correctness of his then newly discovered theory of gravity: General Relativity.  The above picture was taken by the only spacecraft ever to pass Mercury: Mariner 10 in 1974.",
                hdurl = "https://apod.nasa.gov/apod/image/merc2_m10_big.gif",
                media_type = "image",
                service_version = "v1",
                title = "Mercury: A Cratered Inferno",
                url = "https://apod.nasa.gov/apod/image/merc2_m10.gif"
            ),
            MyNasa(
                date = "2017-07-02",
                explanation = "It's stars versus dust in the Carina Nebula and the stars are winning. More precisely, the energetic light and winds from massive newly formed stars are evaporating and dispersing the dusty stellar nurseries in which they formed. Located in the Carina Nebula and known informally as Mystic Mountain, these pillar's appearance is dominated by the dark dust even though it is composed mostly of clear hydrogen gas. Dust pillars such as these are actually much thinner than air and only appear as mountains due to relatively small amounts of opaque interstellar dust.  About 7,500 light-years distant, the featured image was taken with the Hubble Space Telescope and highlights an interior region of Carina which spans about three light years. Within a few million years, the stars will likely win out completely and the entire dust mountain will evaporate.",
                hdurl = "https://apod.nasa.gov/apod/image/1707/carina08_hubble_2104.jpg",
                media_type = "image",
                service_version = "v1",
                title = "Mountains of Dust in the Carina Nebula",
                url = "https://apod.nasa.gov/apod/image/1707/carina08_hubble_960.jpg"
            ),
            MyNasa(
                date = "2010-09-14",
                explanation = "What created the strange spiral structure on the left?  No one is sure, although it is likely related to a star in a binary star system entering the planetary nebula phase, when its outer atmosphere is ejected.  The huge spiral spans about a third of a light year across and, winding four or five complete turns, has a regularity that is without precedent.  Given the expansion rate of the spiral gas, a new layer must appear about every 800 years, a close match to the time it takes for the two stars to orbit each other. The star system that created it is most commonly known as LL Pegasi, but also AFGL 3068. The unusual structure itself has been cataloged as IRAS 23166+1655. The above image was taken in near-infrared light by the Hubble Space Telescope. Why the spiral glows is itself a mystery, with a leading hypothesis being illumination by light reflected from nearby stars.",
                hdurl = "https://apod.nasa.gov/apod/image/1009/llpegspiral_hst_big.jpg",
                media_type = "image",
                service_version = "v1",
                title = "An Extraordinary Spiral from LL Pegasi",
                url = "https://apod.nasa.gov/apod/image/1009/llpegspiral_hst.jpg"
            ),
            MyNasa(
                date = "2004-09-29",
                explanation = "When did galaxies form?  Faint red smudges identified on the deepest optical sky image ever taken may well be members of the first class of galaxies.  Detailed inspection of the Hubble Ultra Deep Field (HUDF), taken by the Advanced Camera for Surveys on the Hubble Space Telescope, found the galaxies, circled above, and used their distance and abundance to probe the universe when it was only a few percent of its present age.  Analyses indicate that the discovered class of galaxies is exclusively composed of these smaller dwarf galaxies from which larger modern galaxies must have formed.  Some large modern galaxies make a colorful foreground to the above HUDF.  The first class of dwarf galaxies likely contained energetic stars emitting light that transformed much of the remaining normal matter in the universe from a cold gas to a hot ionized plasma.",
                hdurl = "https://apod.nasa.gov/apod/image/0409/hudfobjects_hst_big.jpg",
                media_type = "image",
                service_version = "v1",
                title = "HUDF: Dawn of the Galaxies",
                url = "https://apod.nasa.gov/apod/image/0409/hudfobjects_hst.jpg"
            ),
            MyNasa(
                date = "1999-07-23",
                explanation = "Tomorrow's picture: Saturn Day  < Archive | Index | Search | Calendar | Glossary | Education | About APOD >  Authors & editors: Robert Nemiroff (MTU) & Jerry Bonnell (USRA) NASA Technical Rep.: Jay Norris. Specific rights apply. A service of: LHEA at NASA/ GSFC & Michigan Tech. U.",
                hdurl = "https://apod.nasa.gov/apod/image/9907/marsvalley_mgs_big.jpg",
                media_type = "image",
                service_version = "v1",
                title = "A Martian Valley",
                url = "https://apod.nasa.gov/apod/image/9907/marsvalley_mgs.jpg"
            )
        )

    }
}