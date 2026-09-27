package sg.bigo.ads.ad.interstitial;

import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f131806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f131808d;

    public enum a {
        STAR(0, R.string.bigo_ad_ic_blank, R.drawable.bigo_ad_ic_star, R.string.bigo_ad_comment_num_text, 0),
        DOWNLOAD_NUM(0, R.string.bigo_ad_ic_blank, 0, R.string.bigo_ad_download_num_text, 0),
        Everyone(0, 0, R.drawable.bigo_ad_ic_everyone, R.string.bigo_ad_ic_everyone, R.drawable.bigo_ad_ic_everyone_ic_info),
        WEB(1, 0, R.drawable.bigo_ad_ic_web, R.string.bigo_ad_ic_web, 0),
        RECOMMENDED(1, 0, R.drawable.bigo_ad_ic_recommend, R.string.bigo_ad_ic_recommended, 0),
        REVIEWS(3, 0, R.drawable.bigo_ad_ic_star2, R.string.bigo_ad_comment_num_text, 0),
        APPLICATION(2, 0, R.drawable.bigo_ad_ic_phone, R.string.bigo_ad_ic_application, 0),
        DOWNLOAD(2, 0, R.drawable.bigo_ad_ic_download_box, R.string.bigo_ad_download_num_text, 0),
        STAR_WHITE(0, R.string.bigo_ad_ic_blank, R.drawable.bigo_ad_ic_star_white, R.string.bigo_ad_comment_num_text, 0),
        DOWNLOAD_NUM_WHITE(0, R.string.bigo_ad_ic_blank, 0, R.string.bigo_ad_download_num_text, 0),
        Everyone_WHITE(0, 0, R.drawable.bigo_ad_ic_everyone_white, R.string.bigo_ad_ic_everyone, R.drawable.bigo_ad_ic_info_white),
        WEB_WHITE(4, 0, R.drawable.bigo_ad_ic_web_white, R.string.bigo_ad_ic_web, 0),
        RECOMMENDED_WHITE(4, 0, R.drawable.bigo_ad_ic_recommend_white, R.string.bigo_ad_ic_recommended, 0),
        REVIEWS_WHITE(12, 0, R.drawable.bigo_ad_ic_star2_white, R.string.bigo_ad_comment_num_text, 0),
        APPLICATION_WHITE(8, 0, R.drawable.bigo_ad_ic_phone_white, R.string.bigo_ad_ic_application, 0),
        DOWNLOAD_WHITE(8, 0, R.drawable.bigo_ad_ic_download_box_white, R.string.bigo_ad_download_num_text, 0);


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f131826q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f131827r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f131828s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f131829t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f131830u;

        a(int i10, int i11, int i12, int i13, int i14) {
            this.f131826q = i10;
            this.f131827r = i11;
            this.f131828s = i12;
            this.f131829t = i13;
            this.f131830u = i14;
        }

        public static List<a> a(int i10) {
            a[] aVarArrValues = values();
            ArrayList arrayList = new ArrayList();
            for (a aVar : aVarArrValues) {
                int i11 = aVar.f131826q;
                if ((i11 & i10) > 0 || i11 == i10) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
    }

    public f(int i10, int i11, String str) {
        this.f131805a = i10;
        this.f131806b = i11;
        this.f131807c = str;
        this.f131808d = !sg.bigo.ads.common.utils.q.a((CharSequence) str);
    }
}
