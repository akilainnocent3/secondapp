package defpackage;

import com.sportygames.featuredGames.view.FeaturedGames;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wic implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wic(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(pjc.f.a((String) obj2, (f1e0) obj));
            case 1:
                FeaturedGames featuredGames = (FeaturedGames) obj2;
                String str = (String) obj;
                int i2 = FeaturedGames.C;
                try {
                    featuredGames.openGame.j(str);
                    break;
                } catch (Exception unused) {
                }
                return Unit.a;
            default:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((ytw) obj2).setValue(Integer.valueOf((int) (urrVar.a() & 4294967295L)));
                return Unit.a;
        }
    }
}
