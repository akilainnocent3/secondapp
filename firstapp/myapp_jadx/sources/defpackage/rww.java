package defpackage;

import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.data.MyFavoriteLeague;
import com.sportybet.plugin.realsports.data.MyFavoriteTeam;

/* JADX INFO: loaded from: classes6.dex */
public final class rww<T> {
    public MyFavoriteTypeEnum a;
    public String b;
    public boolean c;
    public String d;
    public final String e;
    public String f;
    public a g = null;
    public boolean h = true;
    public final T i;

    public interface a {
        void z(int i, rww rwwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rww(MyFavoriteTypeEnum myFavoriteTypeEnum, MyFavoriteLeague myFavoriteLeague, String str, boolean z, String str2, String str3, String str4) {
        this.a = myFavoriteTypeEnum;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.i = myFavoriteLeague;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rww(MyFavoriteTypeEnum myFavoriteTypeEnum, MyFavoriteTeam myFavoriteTeam, String str, boolean z, String str2, String str3) {
        this.a = myFavoriteTypeEnum;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.f = str3;
        this.i = myFavoriteTeam;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rww(MyFavoriteTypeEnum myFavoriteTypeEnum, Object obj, String str, boolean z, String str2) {
        this.a = myFavoriteTypeEnum;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.i = obj;
    }
}
