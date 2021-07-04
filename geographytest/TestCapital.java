package by.mastudio.geographytest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCapital {
    private static TestCapital sTestCapital;
    private List<Question> mQuestionList;
    //private List<Question> mTestList;

    public static TestCapital get(int capitalNum){
        sTestCapital = new TestCapital();
        return sTestCapital;
    }

    public static List<Question> getTestList(){
        sTestCapital = new TestCapital();
        List<Question> mTestList = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 20; i++){
            mTestList.add(sTestCapital.mQuestionList.remove(rnd.nextInt(sTestCapital.mQuestionList.size())));
        }

        return mTestList;
    }

    private TestCapital(){
        mQuestionList = new ArrayList<>();
        Random rnd = new Random();
        mQuestionList.add(new Question(R.string.country_aus,
                R.string.city_kanberra, R.string.city_sidney, R.string.city_melburn, R.string.city_katmandu,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_aut,
                R.string.city_vena, R.string.city_belgrad, R.string.city_buharest, R.string.city_praga,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_aze,
                R.string.city_baku, R.string.city_erevan, R.string.city_tbilisi, R.string.city_buhara,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_alb,
                R.string.city_tirana, R.string.city_kabul, R.string.city_lublana, R.string.city_kotor,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_afg,
                R.string.city_kabul, R.string.city_doha, R.string.city_islamabad, R.string.city_bagdad,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_arg,
                R.string.city_buenos, R.string.city_karakas, R.string.city_rio, R.string.city_vellington,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_arm,
                R.string.city_erevan, R.string.city_baku, R.string.city_ashhabad, R.string.city_samarkand,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_npl,
                R.string.city_katmandu, R.string.city_managua, R.string.city_pretoria, R.string.city_karachi,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_nld,
                R.string.city_amsterdam, R.string.city_rotterdam, R.string.city_gaaga, R.string.city_kopengagen,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_nic,
                R.string.city_managua, R.string.city_granada, R.string.city_erriyad, R.string.city_bangkok,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_nzl,
                R.string.city_vellington, R.string.city_oklend, R.string.city_kanberra, R.string.city_melburn,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_nor,
                R.string.city_oslo, R.string.city_kopengagen, R.string.city_helsinki, R.string.city_rotterdam,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_mda,
                R.string.city_kishinev, R.string.city_tiraspol, R.string.city_odessa, R.string.city_bishkek,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_kor,
                R.string.city_seul, R.string.city_bangkok, R.string.city_tunis, R.string.city_tirana,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_rus,
                R.string.city_moskva, R.string.city_peterburg, R.string.city_ekaterinburg, R.string.city_kiev,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_rou,
                R.string.city_buharest, R.string.city_belgrad, R.string.city_bratislava, R.string.city_zagreb,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_sau,
                R.string.city_erriyad, R.string.city_mekka, R.string.city_sana, R.string.city_djalalabad,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_srb,
                R.string.city_belgrad, R.string.city_prishtina, R.string.city_lublana, R.string.city_podgorica,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_syr,
                R.string.city_damask, R.string.city_aleppo, R.string.city_ankara, R.string.city_beirut,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_svk,
                R.string.city_bratislava, R.string.city_praga, R.string.city_krakov, R.string.city_belgrad,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_svn,
                R.string.city_lublana, R.string.city_buharest, R.string.city_kishinev, R.string.city_tiraspol,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_gbr,
                R.string.city_london, R.string.city_birmingem, R.string.city_vashington, R.string.city_brussel,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_usa,
                R.string.city_vashington, R.string.city_newyork, R.string.city_losangeles, R.string.city_filadelfia,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_tjk,
                R.string.city_dushanbe, R.string.city_ashhabad, R.string.city_buhara, R.string.city_almaata,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_tha,
                R.string.city_bangkok, R.string.city_manila, R.string.city_doha, R.string.city_djakarta,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_tun,
                R.string.city_tunis, R.string.city_kanberra, R.string.city_ankara, R.string.city_tegeran,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_tkm,
                R.string.city_ashhabad, R.string.city_tashkent, R.string.city_erevan, R.string.city_baku,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_tur,
                R.string.city_ankara, R.string.city_stambul, R.string.city_antalia, R.string.city_tegeran,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_uzb,
                R.string.city_tashkent, R.string.city_samarkand, R.string.city_buhara, R.string.city_almaata,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_ukr,
                R.string.city_kiev, R.string.city_harkov, R.string.city_odessa, R.string.city_kishinev,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_phl,
                R.string.city_manila, R.string.city_kalukan, R.string.city_djakarta, R.string.city_nikosia,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_fin,
                R.string.city_helsinki, R.string.city_stokgolm, R.string.city_ottava, R.string.city_oslo,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_fra,
                R.string.city_paris, R.string.city_marsel, R.string.city_nicca, R.string.city_neapol,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_hrv,
                R.string.city_zagreb, R.string.city_praga, R.string.city_prishtina, R.string.city_buharest,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_cze,
                R.string.city_praga, R.string.city_bratislava, R.string.city_krakov, R.string.city_milan,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_mne,
                R.string.city_podgorica, R.string.city_budva, R.string.city_kotor, R.string.city_zagreb,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_che,
                R.string.city_bern, R.string.city_zurih, R.string.city_zheneva, R.string.city_lozanna,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_swe,
                R.string.city_stokgolm, R.string.city_tallin, R.string.city_helsinki, R.string.city_antverpen,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_est,
                R.string.city_tallin, R.string.city_bern, R.string.city_riga, R.string.city_vilnus,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_jpn,
                R.string.city_tokio, R.string.city_osaka, R.string.city_kioto, R.string.city_hirosima,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_zaf,
                R.string.city_pretoria, R.string.city_johannesburg, R.string.city_keyptaun, R.string.city_gvadalahara,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_mex,
                R.string.city_mehiko, R.string.city_tihuana, R.string.city_gvadalahara, R.string.city_tegusigalpa,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_kaz,
                R.string.city_nursultan, R.string.city_almaata, R.string.city_tashkent, R.string.city_buhara,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_can,
                R.string.city_ottava, R.string.city_toronto, R.string.city_monreal, R.string.city_kalgari,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_qat,
                R.string.city_doha, R.string.city_aldjamalia, R.string.city_mumbai, R.string.city_mekka,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_cyp,
                R.string.city_nikosia, R.string.city_larnaka, R.string.city_beirut, R.string.city_portu,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_chn,
                R.string.city_pekin, R.string.city_shanhai, R.string.city_guanchzhou, R.string.city_gonkong,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_cub,
                R.string.city_gavana, R.string.city_santiagodekuba, R.string.city_guantanamo, R.string.city_sanpaulu,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_kwt,
                R.string.city_elkuveit, R.string.city_eldjahra, R.string.city_erriyad, R.string.city_sana,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_kgz,
                R.string.city_bishkek, R.string.city_djalalabad, R.string.city_islamabad, R.string.city_ashhabad,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_pak,
                R.string.city_islamabad, R.string.city_karachi, R.string.city_kabul, R.string.city_bagdad,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_pol,
                R.string.city_varshava, R.string.city_krakov, R.string.city_belostok, R.string.city_belgrad,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_prt,
                R.string.city_lissabon, R.string.city_portu, R.string.city_valensia, R.string.city_madrid,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_ind,
                R.string.city_newdeli, R.string.city_mumbai, R.string.city_kalkutta, R.string.city_deli,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_idn,
                R.string.city_djakarta, R.string.city_karakas, R.string.city_beirut, R.string.city_doha,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_esp,
                R.string.city_madrid, R.string.city_barselona, R.string.city_valensia, R.string.city_milan,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_ita,
                R.string.city_rim, R.string.city_milan, R.string.city_neapol, R.string.city_genuia,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_irq,
                R.string.city_bagdad, R.string.city_mumbai, R.string.city_batumi, R.string.city_tegeran,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_irn,
                R.string.city_tegeran, R.string.city_islamabad, R.string.city_kabul, R.string.city_karakas,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_irl,
                R.string.city_dublin, R.string.city_brussel, R.string.city_stokgolm, R.string.city_birmingem,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_blr,
                R.string.city_minsk, R.string.city_mogilev, R.string.city_vitebsk, R.string.city_aleksandria,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_bel,
                R.string.city_brussel, R.string.city_antverpen, R.string.city_gaaga, R.string.city_kopengagen,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_bgr,
                R.string.city_sofia, R.string.city_varna, R.string.city_karachi, R.string.city_afini,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_bih,
                R.string.city_saraevo, R.string.city_sofia, R.string.city_nikosia, R.string.city_podgorica,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_bra,
                R.string.city_brazilia, R.string.city_rio, R.string.city_sanpaulu, R.string.city_buenos,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_hun,
                R.string.city_budapesht, R.string.city_sofia, R.string.city_praga, R.string.city_barselona,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_ven,
                R.string.city_karakas, R.string.city_kair, R.string.city_tegusigalpa, R.string.city_sanpaulu,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_vnm,
                R.string.city_hanoi, R.string.city_pekin, R.string.city_seul, R.string.city_managua,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_deu,
                R.string.city_berlin, R.string.city_bonn, R.string.city_gamburg, R.string.city_munhen,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_grc,
                R.string.city_afini, R.string.city_saloniki, R.string.city_nikosia, R.string.city_sofia,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_geo,
                R.string.city_tbilisi, R.string.city_kutaisi, R.string.city_batumi, R.string.city_erevan,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_dnk,
                R.string.city_kopengagen, R.string.city_gaaga, R.string.city_amsterdam, R.string.city_dublin,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_egy,
                R.string.city_kair, R.string.city_hurgada, R.string.city_aleksandria, R.string.city_beirut,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_lva,
                R.string.city_riga, R.string.city_jurmala, R.string.city_vilnus, R.string.city_tallin,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_lbn,
                R.string.city_beirut, R.string.city_tirana, R.string.city_damask, R.string.city_bern,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_ltu,
                R.string.city_vilnus, R.string.city_kaunas, R.string.city_riga, R.string.city_belostok,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_yem,
                R.string.city_sana, R.string.city_erriyad, R.string.city_damask, R.string.city_larnaka,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_hnd,
                R.string.city_tegusigalpa, R.string.city_karakas, R.string.city_managua, R.string.city_manila,
                rnd.nextInt(4)));
        mQuestionList.add(new Question(R.string.country_prk,
                R.string.city_phenjan, R.string.city_seul, R.string.city_hanoi, R.string.city_managua,
                rnd.nextInt(4)));
    }
}
