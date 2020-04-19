package com.rizal.dicodingsubmission

object StreamData {
    private val data = arrayOf(
        arrayOf(
            "Netflix",
            "https://assets.brand.microsites.netflix.io/assets/493f5bba-81a4-11e9-bf79-066b49664af6_cm_1440w.png?v=16",
            "Netflix, Inc. (/ˈnɛtflɪks/) is an American media-services provider and production company headquartered in Los Gatos, California, founded in 1997 by Reed Hastings and Marc Randolph in Scotts Valley, California. The company's primary business is its subscription-based streaming service which offers online streaming of a library of films and television programs, including those produced in-house. As of April 2019, Netflix had over 148 million paid subscriptions worldwide, including 60 million in the United States, and over 154 million subscriptions total including free trials. It is available worldwide except in mainland China (due to local restrictions), Syria, North Korea, and Crimea (due to U.S. sanctions). The company also has offices in India, Netherlands, Brazil, Japan, and South Korea. Netflix is a member of the Motion Picture Association (MPA).",
            "29 August 1997",
            "Reed Hastings & Marc Randolph",
            "Los Gatos, California, U.S.",
            "www.netflix.com"
        ),
        arrayOf(
            "HBO",
            "data:image/png;base64,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",
            "HBO (Home Box Office) is an American premium television network owned by Home Box Office, Inc., a subsidiary of WarnerMedia Entertainment. The programming featured on the network consists primarily of theatrically released motion pictures and original television shows, along with made-for-cable movies, documentaries and occasional comedy and concert specials.",
            "8 November 1972",
            "Charles Dolan",
            "New York City, New York, U.S.",
            "http://homeboxoffice.com/"
        ),
        arrayOf(
            "Iflix",
            "https://d1nslcd7m2225b.cloudfront.net/Pictures/2000x2000fit/3/5/5/1301355_iflix-2.jpg",
            "Iflix (stylized as iflix) is a free and subscription video on demand (VOD) service focused on emerging markets. Its global headquarters are in Kuala Lumpur, Malaysia. The site serves as a digital hosting and distribution platform for Western, Asian, and Middle Eastern TV shows and movies obtained through partnerships with over 150 studios and content distributors globally including Metro-Goldwyn-Mayer, Disney, Warner Bros, Paramount, NBC Universal, Fox, CBS, BBC, Sony Pictures and Discovery.",
            "2014",
            "Patrick Grove",
            "Kuala Lumpur, Malaysia",
            "https://www.iflix.com/"
        ),
        arrayOf(
            "Amazon Prime Video",
            "https://upload.wikimedia.org/wikipedia/commons/f/f1/Prime_Video.png",
            "Prime Video, also marketed as Amazon Prime Video, is an American Internet video on demand service that is developed, owned, and operated by Amazon. It offers television shows and films for rent or purchase and Prime Video, a selection of Amazon Studios original content and licensed acquisitions included in the Amazon's Prime subscription. ",
            "2 February 2005",
            "Amazon",
            "Seattle, Washington, United States",
            "http://www.primevideo.com/"
        ),
        arrayOf(
            "HOOQ",
            "https://www.licenseglobal.com/sites/licenseglobal.com/files/styles/article_featured_retina/public/hooq.png?itok=s2aJ6T9t",
            "HOOQ (pronounced as hook) is a Singaporean video on demand streaming service. It is a joint-venture of Sony Pictures, Warner Bros., and Singtel with presence in the Philippines, Thailand, India, Indonesia, and Singapore. HOOQ filed for liquidation on 27 March 2020.",
            "2015",
            "Krishnan Rajagopalan",
            "Singapore",
            "https://www.hooq.tv/"
        ),
        arrayOf(
            "VIU",
            "https://media.karousell.com/media/photos/products/2019/09/13/viu_premium_1_tahun_1568374244_c4d3dd70.jpg",
            "Viu is a Hong Kong-based over-the-top (OTT) video streaming provider from PCCW Media, a subsidiary of PCCW. Operated in dual-revenue model comprising subscriptions and advertising, Viu delivers content in different genres from Asia's top content providers with local language subtitles, as well as original production series under 'Viu Original' initiative.",
            "26 October 2015",
            "empty",
            "Hongkong",
            "viu.com"
        ),
        arrayOf(
            "Disney+",
            "https://lumiere-a.akamaihd.net/v1/images/2_disney_logo_29e79241_fbd045f0.png?region=0,95,1820,1023",
            "Disney+ (pronounced Disney Plus) is a subscription video on-demand streaming service owned and operated by the Direct-to-Consumer & International (DTCI) subsidiary of The Walt Disney Company. The service primarily distributes films and television series produced by The Walt Disney Studios and Walt Disney Television, with the service advertising content from Disney's Marvel, National Geographic, Pixar, and Star Wars brands in particular.",
            "12 November 2019",
            "Ricky Strauss",
            "Burbank, California, America",
            "disneyplus.com"
            ),
        arrayOf(
            "YouTube",
            "https://mmc.tirto.id/image/otf/500x0/2017/08/30/logo-youtube-new-youtube.comcopy_ratio-16x9.jpg",
            "YouTube is an American online video-sharing platform headquartered in San Bruno, California. Three former PayPal employees—Chad Hurley, Steve Chen, and Jawed Karim—created the service in February 2005. Google bought the site in November 2006 for US $1.65 billion YouTube now operates as one of Google's subsidiaries.",
            "14 February 2005",
            "Chad Hurley, Steve Chen, Jawed karim",
            "901 Cherry Avenue San Bruno, California, United States",
            "youtube.com"
        ),
        arrayOf(
            "CatchPlay",
            "https://daftar-indihome.com/wp-content/uploads/2020/03/Catchplay-1400.jpg",
            "CATCHPLAY is a Taiwanese multimedia company founded in 2007, whose businesses include OTT VOD streaming service operation, linear television channel operation (CatchPlay Movie Channel) and theatrical film distribution. Legally, it operates as a Taiwan branch of CatchPlay, Inc. (Chinese: 威望國際娛樂股份有限公司), a company registered in Cayman Islands.",
            "2007",
            "Timothy Chen",
            "Taipei, Taiwan",
            "http://www.catchplay.com/"
        ),
        arrayOf(
            "Google Play Movies",
            "https://img.tek.id/img/content/2020/03/26/27233/google-bakal-tawarkan-film-gratis-beriklan-di-google-play-movies-qLBICEJwnA.jpg",
            "Google Play Movies & TV is an online video on demand service operated by Google, part of its Google Play product line. The service offers movies and television shows for purchase or rental, depending on availability. Google claims that most content is available in high definition, and a 4K Ultra HD video option was offered for select titles starting in December 2016. Content can be watched on the Google Play website, through an extension for the Google Chrome web browser, or through the available for Android and OS devices. Offline download is supported through the mobile app and on devices. A variety of options exist for watching content on a television.",
            "March 2012",
            "Google's",
            "California, USA",
            "https://play.google.com/store/movies/"
        )
    )

    val listData: ArrayList<Stream>
        get() {
            val list = ArrayList<Stream>()
            for (aData in data) {
                val stream = Stream()
                stream.name = aData[0]
                stream.photo = aData[1]
                stream.detail = aData[2]
                stream.founded = aData[3]
                stream.founder = aData[4]
                stream.headquarters = aData[5]
                stream.link = aData[6]

                list.add(stream)
            }
            return list
        }
}