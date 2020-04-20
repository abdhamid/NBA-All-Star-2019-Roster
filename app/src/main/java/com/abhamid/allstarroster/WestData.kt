package com.abhamid.allstarroster

object WestData{
    private val data = arrayOf(
        arrayOf("LeBron James",
            "Forward",
            "#23",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/2544.png",
            "Los Angeles Lakers",
            "CAPTAIN | 15-time All-Star | Four-time Kia MVP | Three-time All-Star MVP",
            "https://m.youtube.com/results?search_query=lebron+james+highlights"
        ),
        arrayOf("James Harden",
            "Guard",
            "#13",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/201935.png",
            "Houston Rockets",
            "Seven-time All-Star | 2018 Kia NBA MVP | 2018 NBA scoring champ",
            "https://m.youtube.com/results?search_query=james+harden+highlights"
        ),
        arrayOf("Kevin Durant",
            "Forward",
            "#35",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/201142.png",
            "Brooklyn Nets",
            "10-time All-Star | Back-to-back NBA Finals MVP",
            "https://m.youtube.com/results?search_query=kevin+durant+highlights"
        ),
        arrayOf("Kyrie Irving",
            "Guard",
            "#11",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/202681.png",
            "Brooklyn Nets",
            "Six-time All-Star | 2014 Kia All-Star MVP | 2012 Kia Rookie of the Year",
            "https://m.youtube.com/results?search_query=kyrie+irving+highlights"
        ),
        arrayOf("Kawhi Leonard",
            "Forward",
            "#2",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/202695.png",
            "Los Angeles Clippers",
            "Three-time All-Star | 2014 Finals MVP | Two-time Kia Def. Player of Year",
            "https://m.youtube.com/results?search_query=kawhi+leonard+highlights"
        ),
        arrayOf("Bradley Beal",
            "Guard",
            "#33",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/203078.png",
            "Washington Wizards",
            "Two-time All-Star | 2013 First Team All-Rookie",
            "https://m.youtube.com/results?search_query=bradley+beal+highlights"
        ),
        arrayOf("Anthony Davis",
            "Forward-Center",
            "#3",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/203076.png",
            "Los Angeles Lakers",
            "Six-time All-Star | Scored 52 points in 2017 All-Star Game",
            "https://m.youtube.com/results?search_query=anthony+davis+highlights"
        ),
        arrayOf("Ben Simmons",
            "Forward",
            "#25",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/1627732.png",
            "Philadelphia 76ers",
            "First-time All-Star | 2018 Kia Rookie of the Year",
            "https://m.youtube.com/results?search_query=ben+simmons+highlights"
        ),
        arrayOf("Damian Lillard",
            "Guard",
            "#0",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/203081.png",
            "Portland Trailblazers",
            "Four-time All-Star | 2018 First Team All-NBA",
            "https://m.youtube.com/results?search_query=damian+lillard+highlights"
        ),
        arrayOf("Dwyane Wade",
            "Guard",
            "#3",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/2548.png",
            "Miami Heat",
            "13-time All-Star | Three-time NBA champion",
            "https://m.youtube.com/results?search_query=dwyane+wade+highlights"
        ),
        arrayOf("Karl-Anthony Towns",
            "Center",
            "#32",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/1626157.png",
            "Minnesota Timberwolves",
            "Two-time All-Star | 2016 Kia NBA Rookie of the Year",
            "https://m.youtube.com/results?search_query=karl-anthony+towns+highlights"
        ),
        arrayOf("Klay Thompson",
            "Guard",
            "#11",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/202691.png",
            "Golden State Warriors",
            "Five-time All-Star | Three-time NBA champion",
            "https://m.youtube.com/results?search_query=klay+thompson+highlights"
        ),
        arrayOf("LaMarcus Aldridge",
            "Center-Forward",
            "#12",
            "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/200746.png",
            "San Antonio Spurs",
            "Seven-time All-Star | Two-time Second Team All-NBA",
            "https://m.youtube.com/results?search_query=lamarcus+aldridge+highlights"
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