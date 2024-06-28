package com.googletuto.artgallery

class Data {

    fun initializePaintings(): List<Painting> {
        val paintings: List<Painting> = listOf(
            Painting(
                R.drawable.lily,
                title = "The Water Lily Pond",
                description = "By the 1890s, the financial worries that had plagued Monet for most of his life were coming to an era and he was able to buy Giverny - in fact he had established some wealth and was able to lavish his money on his own home and garden for the first time. It would result in a stunning and unique property, which included the most exciting garden - designed by the artist - and its Water Lily Pond. Planning permission was granted in 1893 and he spent much of his focus on the bridge in his works. Incredibly, he only painted about three works of the lily pond up to 1897, This work, from 1899, is exquisite in its composition of background trees, weeping willow, and the bridge, which underwent many alterations up to 1910. The pond here is literally obliterated by vegetation and lilies. It is composed of short brushstrokes - a familiar method during his mature years. In a letter, Monet described how he had planted the water lilies for fun - he had never intended painting them, however, once they established themselves they almost became his only source of inspiration. He wrote: \"I saw, all of a sudden, that my pond had become enchanted... Since then, I have had no other model.\""),

            Painting(
                id = R.drawable.argenteuil,
                title = "The Poppy Field near Argenteuil",
                description = "Claude Monet painted The Poppy Field near Argenteuil in 1873 on his return from the United Kingdom (in 1871) when he settled in Argenteuil with his family until 1878. It was a time that provided the artist with great fulfillment as a painter, despite the failing health of Camille. Paul Durand-Ruel, Monet's art dealer, helped support him during this time, where he found great comfort from the picturesque landscapes that surrounded him and provided him with plenty of subject matter from which to choose. It was a time that Monet's Plein air works would develop, and this particular painting was shown at the first Impressionist exhibition of 1874.\n" +
                        "\n" +
                        "This beautifully depicted summer's day is captured in all its glory with the vibrant poppies complementing the wispy clouds in a clear blue sky. In the landscape, a mother and child pair in the foreground and another in the background are merely a pretext for drawing the diagonal line that structures the painting. Two separate color zones are established, one dominated by red, the other by a bluish-green. The young woman with the sunshade and the child in the foreground is probably the artist's wife, Camille, and their son Jean.\n" +
                        "\n" +
                        "Monet diluted the contours and constructed a colorful rhythm with blobs of paint starting from a sprinkling of poppies; the disproportionately large patches in the foreground indicate the primacy he put on visual impression. A step towards abstraction had been taken."
            ),
            Painting(
                id = R.drawable.giorgio,
            title = "San Giorgio Maggiore at Dusk",
            description = "San Giorgio Maggiore at Dusk is an oil painting by Claude Monet that was painted in 1908. The painting is owned by National Museum Cardiff, the national art gallery of Wales. The original painting is oil on canvas and the dimension is 65.2cm x 92.4cm (25.7 in x 36.4 in).\n" +
                    "\n" +
                    "The term impression signifies the sensory information registered on the retina prior to any recognition of the object. For example, the eye sees tiny black spots before it recognizes them as faraway pedestrians. When you go out to paint, try to forget what objects you have before you, a tree, a house, a field or whatever Monet explained to a neighbor in Giverny, merely think here is a little square of blue, here an oblong of pink, here a streak of yellow, and paint it just as it looks to you, the exact color and shape, until it gives you your own naïve impression of the scene before you.\n" +
                    "\n" +
                    "Monet later claimed that he wished he might share the experience of a blind person suddenly granted the power of sight.\n" +
                    "\n" +
                    "San Giorgio Maggiore at Dusk is a prime example of Claude Monet. Also occasionally referred to as Sunset in Venice, was painted in the autumn of 1908 in Venice where Monet and his wife Alice had traveled by their own chauffeur-driven car. They stayed first at the Palazzo Barbaro and later at the Hotel Brittania. It was here that he created this masterpiece.\n" +
                    "\n" +
                    "The period in which Monet created this riverscape or seascape painting was when he began losing his eyesight from gray cataracts. Much like other impressionists who were afflicted with pain or disease, suffering seemed to provoke them to do their greatest works: Vincent van Gogh created his magnum opus Starry Night while tormented by his psychological breakdown, Monet painted this masterpiece. The vibrant blue, yellow, and red colors were used by Monet to depict the sunset. Across the lagoon we see Venice, a famous island church in Venice, Italy."
            ),
            Painting(
                id = R.drawable.sunrise,
                title = "Impression Sunrise",
                description = "This famous painting, Impression, Sunrise, was created from a scene in the port of Le Havre. Monet depicts a mist, which provides a hazy background to the piece set in the French harbor. The orange and yellow hues contrast brilliantly with the dark vessels, where little, if any detail is immediately visible to the audience. It is a striking and candid work that shows the smaller boats in the foreground almost being propelled along by the movement of the water. This has, once again, been achieved by separate brushstrokes that also show various colors \"sparkling\" on the sea.\n" +
                        "\n" +
                        "From the 15th April to 15th May 1874 Monet exhibited his work together with Camille Pissarro, Alfred Sisley, Edouard Manet, Paul Cezanne, Edgar Degas, and some other thirty artists. They organized their exhibition on their own as they were usually rejected at the Paris Salon. Most visitors were disgusted and even outraged over such a graffiti. Monet's Impression, Sunrise enjoyed the most attention and some visitors even claimed that they were absolutely unable to recognize what was shown at all.\n" +
                        "\n" +
                        "A critic who attended the exhibition, M. Louis Leroy, wrote a now-famous article in Le Charivari in which he used the term \"Impressionist\" based on the title of this painting. Despite the fact that Leroy had used the word derisively, the group decided to adopt it and painters such as Renoir and Degas were happy to be called Impressionists.\n" +
                        "\n" +
                        "Despite its notoriety, the painting is in some ways untypical of Monet's own work of this period and of Impressionism more generally. It shows little of the Impressionist treatment of light and colour. The colours are very restrained and the paint is applied not in discrete brushstrokes of contrasting colours but in very thin washes. In some places, the canvas is even visible and the only use of impasto is in the depiction of the reflected sunlight on the water. The painting is strongly atmospheric rather than analytical and has a spirit somewhat akin to Turner's works. Nevertheless, it does illustrate particularly well one of the features of an Impressionist painting that was thought so revolutionary. The technique is very 'sketchy' and would have been seen as a preliminary study for a painting rather than a finished work suitable for exhibition. (Monet himself saw the work as unfinished, and it was for that reason that he adopted the title 'Impression' to distinguish it from such works as his other view of Le Havre in the same exhibition, though this too lacks the finish than expected.) In this work, Monet stripped away the details to a bare minimum: the dockyards in tile background are merely suggested by a few brushstrokes as are the boats in the foreground. The whole represents the artist's swift attempt to capture a fleeting moment. The highly visible, near-abstract technique, compels almost more attention than the subject-matter itself, a notion then wholly alien to viewers.\n" +
                        "\n" +
                        "Today, Impression, Sunrise is considered as the most prominent Impressionism painting, along with the famous Van Gogh night stars painting."
            ),
            Painting(
                id = R.drawable.haystacks,
                title = "Haystacks",
                description = "Haystacks is a title of a series of impressionist paintings by Monet. The primary subjects of all of the paintings in the series are stacks of hay in the field after the harvest season. The title refers primarily to a twenty-five canvas series begun at the end of summer of 1890 and continued through the following spring, using that year's harvest. Some use a broader definition of the title to refer to other paintings by Monet with this same theme. The series is known for its thematic use of repetition to show differences in perception of light across various times of day, seasons, and types of weather. The subjects were painted in fields near Monet's home in Giverny, France.\n" +
                        "\n" +
                        "The series is among Monet's most notable works.\n" +
                        "\n" +
                        "Monet settled in Giverny in 1883. Most of his paintings from 1883 until his death 40 years later were of scenes within 3 kilometers (2 mi) of his home. Indeed, the haystacks themselves were situated just outside his door. He was intensely aware of and fascinated by the visual nuances of the region's landscape and the variation in the seasons."
            ),
            Painting(
                id = R.drawable.magpie,
                title = "The Magpie",
                description = "The Magpie is created during the winter of 1868 - 1869 near the commune of Étretat in Normandy. Monet's patron, Louis Joachim Gaudibert, helped arrange a house in Étretat for Monet's girlfriend Camille Doncieux and their newborn son, allowing Monet to paint in relative comfort, surrounded by his family.\n" +
                        "\n" +
                        "Between 1867 and 1893, Monet and fellow Impressionists Alfred Sisley and Pissarro painted hundreds of landscapes illustrating the natural effect of snow (effet de neige). Similar winter paintings of lesser quantity were produced by Pierre-Auguste Renoir, Gustave Caillebotte, and Gauguin.\n" +
                        "\n" +
                        "This exquisite snowscape came as a result of success with snow scenes by Gustave Courbet. Monet takes the simple theme of a single magpie sitting on the gate for the focus of his piece. The bird sits as if in contemplative mood in the idyllic landscape setting. The shadows and the light contrast beautifully against the background of trees, ice sky, and snowcovered buildings. There are those that advocate that this is the first \"true\" Impressionist painting, created five years before the movement was given its name."
            ),
            Painting(
                id = R.drawable.giverny,
                title = "Garden Path at Giverny",
                description = "Monet's paintings of his water-garden and water-lilies at Giverny occupied him for many years in the latter part of his life and were his last great work. Like the works of Turner in the final stage, they were for a long time misunderstood and unappreciated but similarly revived in esteem in the light of modern reappraisal. By the end of 1890 Monet was making enough from the sales of his pictures to buy his house at Giverny outright and soon after began improvements to the garden which included the formation of a pond from a marshy tract by damming a stream that ran into the river Epte. He had a bridge built over the pond in Japanese taste' and his first paintings of the water-garden in a series, 1899-1900, give prominence to the bridge with water-lilies beneath and weeping willows, by that time well-grown, around it. These pictures formed a quiet beginning to what was to become an increasingly exciting enterprise.\n" +
                        "\n" +
                        "In the second phase of forty-eight pictures produced between 1903 and 1908, he dispensed with the bridge which had been a somewhat conventional accessory, set his angle of vision nearer to the water surface and composed his picture simply of the water-lilies and reflections in the water, with only a suggestion of trees and other vegetation on the banks in the background. The pond became a sort of magic mirror holding such amazing depth and beauty of color and variety of light as can be appreciated here. More akin to Japan in spirit that the hump-backed bridge was the decorative sense that Monet now displayed in the selection of the areas of blue and green leaf and the touches of white and red in vivid design against the deeps of color to the right and in the foreground of this painting. As the series continued Monet made modifications in his scheme of design; although he used large canvases he limited the number of plants to appear in them and increased their size. Finally he painted them from almost directly overhead, thus eliminating normal perspective, the play of light on the surface place being now the main feature. In this decorative treatment, as may be noticed in other works of the turn of the century, there came a certain suggestion of art nouveau."
            ),
            Painting(
                id = R.drawable.cliff,
                title = "Cliff Walk at Pourville",
                description = "Monet completed Walk on the Cliff at Pourville in 1882 where he visited Normandy in order to find some escape from personal and professional pressures. It was three years since the death of Camille and he had a new arrangement with Alice Hoschede whom he would later marry following her husband's death in 1892, At this time, once again, Monet was plagued by financial worries. An economic recession in France had greatly affected the sales of his works and he was less than keen on the forthcoming Impressionist exhibition due to differences within the group. He settled in the fishing village of Pourville for a time and became increasingly encouraged by his new surroundings. Alice and her children joined him during the summer. It is thought that the two young women depicted are Marthe and Blanche, two of Alice's daughters, while other commentators suggest the woman is Alice herself accompanied by one of her children.\n" +
                        "\n" +
                        "In this work, Monet addressed the problem of inserting figures into a landscape without disrupting the unity of its painterly surface. He integrated these elements with one another through texture and color. The grass - composed of short, brisk, curved brushstrokes - appears to quiver in the breeze, and subtly modified versions of the same strokes and hues suggest the women's wind-whipped dresses and shawls and the undulation of the sea. X-radiographs show that Monet reduced the rocky outcropping at the far right to balance the proportions of sea and sky."
            ),

            Painting(
                id = R.drawable.garden,
                title = "The Artist's Garden at Giverny",
                description = "Throughout his life, Monet had been an avid and knowledgeable gardener. It was at Giverny, however, his last home and the place he lived at for the longest, that his vision for a garden became a reality. He was meticulous in his approach to planning the garden, which expanded over the gears to incorporate his now-famous pond. Monet undertook extensive research for his garden and planned and planted his flowerbeds with the color of his blooms and the time of their flowering foremost in his mind to produce a coherent aesthetic throughout.\n" +
                        "\n" +
                        "His garden was a constant source of inspiration to him, particularly in later life, and included one especially important flowerbed planted in memory of his beloved aunt. The flowerbed was below the artist's bedroom window and was an exact copy of one that his aunt had had, and he had painted, at her home in Sainte-Adresse.\n" +
                        "\n" +
                        "Iris,the beautiful purple and violet flower,is the favorite subject painted many times by two of the great impression artists - Vincent van Gogh and Claude Monet. Irises by Van Gogh is in vibrant color-the violet petals, the blue leaves and the rich red soils with bright orange marigolds in the background; It's full of vitality - the flowers waving and twisting with rhythm. While Iris of Monet is in a sublime scene: under willow trees,and the purple petals are shimmering in the sunshine, almost floating on the top of the clusters, which epitomizes Monet's use of brilliant color to produce the effect of a radiant summer sun."
            ),
            Painting(
                id = R.drawable.tulip,
                title = "Tulip Fields",
                description = "In the spring of 1886 Monet spent a few dogs painting in Holland, delighting in the vast fields of tulips that stretched as far as the eye could see. Fields of flowers were not a new motif for the artist, but he had never had the opportunity to paint two such opposing elements - that of the natural tulip grown in regimented, man-made format. These fields of tulips, split into different colors that formed geometric bands of solid contrasting color across the flat landscape, were an ideal subject for Monet. Furthermore, the fields were frequently bordered by ribbon-like canals, in whose waters the brilliant colors of the tulips were sharply reflected.\n" +
                        "\n" +
                        "In 1886, when Van Gogh arrived in Paris, Tulip Fields was shown in Petit's exhibition. The painting undoubtedly has attracted Van Gogh's attention, and has a pronounced effect on his work. Van Gogh's Paintings, which had to this point been dark and tonal, are lightened dramatically and his style became directly influenced by the painting techniques of the Claude Monet."
            )
        )

        return paintings
    }

}