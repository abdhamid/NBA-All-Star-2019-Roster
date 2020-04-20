package com.abhamid.allstarroster

object EastData{
    private val data = arrayOf(
        arrayOf("Giannis Antetokounmpo",
            "Forward",
            "#34",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/203507.png",
            "Milwaukee Bucks",
            "CAPTAIN | Three time All Star | 2019 NBA Most Valuable Player",
            "https://m.youtube.com/results?search_query=giannis+antetokounmpo+highlights"
        ),
        arrayOf("Stephen Curry",
            "Guard",
            "#30",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/201939.png",
            "Golden State Warriors",
            "Six-time All-Star | Two-time Kia NBA MVP",
            "https://m.youtube.com/results?search_query=stephen+curry+highlights"
        ),
        arrayOf("Joel Embiid",
            "Forward-Center",
            "#21",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/203954.png",
            "Philadelphia 76ers",
            "Two-time All-Star | 2018 Second Team All-NBA",
            "https://m.youtube.com/results?search_query=joel+embiid+highlights"
        ),
        arrayOf("Paul George",
            "Forward",
            "#13",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/202331.png",
            "Los Angeles Clippers",
            "Six-time All-Star | Four-time Third Team All-NBA",
            "https://m.youtube.com/results?search_query=paul+george+highlights"
        ),
        arrayOf("Kemba Walker",
            "Guard",
            "#15",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/202689.png",
            "Boston Celtics",
            "Three-time All-Star | Two-time NBA Sportsmanship winner",
            "https://m.youtube.com/results?search_query=kemba+walker+highlights"
        ),
        arrayOf("Blake Griffin",
            "Forward",
            "#23",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/201933.png",
            "Detroit Pistons",
            "Six-time All-Star | Three-time Second Team All-NBA",
            "https://m.youtube.com/results?search_query=blake+griffin+highlights"
        ),
        arrayOf("D'Angelo Russell",
            "Guard",
            "#1",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/1626156.png",
            "Golden State Warriors",
            "First-time All-Star | Leading scorer on Nets",
            "https://m.youtube.com/results?search_query=d%27angelo+russell+highlights"
        ),
        arrayOf("Dirk Nowitzki",
            "Forward",
            "#41",
            "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/609.png",
            "Dallas Mavericks",
            "14-time All-Star | 2011 Finals MVP",
            "https://m.youtube.com/results?search_query=dirk+nowitzki+highlights"
        ),
        arrayOf("Khris Middleton",
            "Forward",
            "#22",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/203114.png",
            "Milwaukee Bucks",
            "First-time All-Star | Second-leading scorer on Bucks",
            "https://m.youtube.com/results?search_query=khris+middleton+highlights"
        ),
        arrayOf("Kyle Lowry",
            "Guard",
            "#7",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/200768.png",
            "Toronto Raptors",
            "Five-time All-Star | 2016 Third Team All-NBA",
            "https://m.youtube.com/results?search_query=kyle+lowry+highlights"
        ),
        arrayOf("Nikola Jokic",
            "Center",
            "#15",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/203999.png",
            "Denver Nuggets",
            "First-time All-Star | 2016 First Team All-Rookie",
            "https://m.youtube.com/results?search_query=nikola+jokic+highlights"
        ),
        arrayOf("Nikola Vucevic",
            "Center",
            "#9",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/202696.png",
            "Orlando Magic",
            "First-time All-Star | Leading scorer on Magic",
            "https://m.youtube.com/results?search_query=nikola+vucevic+highlights"
        ),
        arrayOf("Victor Oladipo",
            "Guard",
            "#4",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/203506.png",
            "Indiana Pacers",
            "INJURED | Two-time All-Star | Replaced by D'Angelo Russell",
            "https://m.youtube.com/results?search_query=victor+oladipo+highlights"
        ),
        arrayOf("Russell Westbrook",
            "Guard",
            "#0",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/201566.png",
            "Houston Rockets",
            "Eight-time All-Star | 2017 Kia MVP | Two-time Kia All-Star MVP",
            "https://m.youtube.com/results?search_query=russell+westbrook+highlights"
        )
    )
    val listData: ArrayList<Players>
        get() {
            val list = arrayListOf<Players>()
            for (aData in data) {
                val player = Players()
                player.name = aData[0]
                player.position = aData[1]
                player.number = aData[2]
                player.photo = aData[3]
                player.team = aData[4]
                player.desc = aData[5]
                player.hg = aData[6]

                list.add(player)
            }
            return list
        }
}