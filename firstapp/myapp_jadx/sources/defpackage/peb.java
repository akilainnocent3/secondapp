package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class peb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ peb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String name;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj2;
                try {
                    if (((bbs.a) obj) == bbs.a.a) {
                        fgbVar.u2 = 0;
                        if (fgbVar.d1().A) {
                            String country = SportyGamesManager.getInstance().getCountry();
                            String str = "";
                            if (country == null) {
                                country = "";
                            }
                            Locale locale = Locale.ROOT;
                            String lowerCase = country.toLowerCase(locale);
                            lowerCase.getClass();
                            if (fgbVar.k2()) {
                                GameDetails gameDetails = fgbVar.i;
                                String name2 = gameDetails != null ? gameDetails.getName() : null;
                                if (name2 == null) {
                                    name2 = "";
                                }
                                String strF = krh0.f(name2);
                                fuj fujVarD1 = fgbVar.d1();
                                String lowerCase2 = fgbVar.y0.toLowerCase(locale);
                                lowerCase2.getClass();
                                fujVarD1.C1(lowerCase2, strF, lowerCase.equals("int") ? "br" : lowerCase);
                                loa0 loa0VarK1 = fgbVar.k1();
                                String lowerCase3 = fgbVar.y0.toLowerCase(locale);
                                lowerCase3.getClass();
                                loa0VarK1.z1(lowerCase3, fgbVar.w0);
                            }
                            if (fgbVar.Q0()) {
                                try {
                                    db6 db6Var = (db6) fgbVar.f2.getValue();
                                    GameDetails gameDetails2 = fgbVar.i;
                                    if (gameDetails2 != null && (name = gameDetails2.getName()) != null) {
                                        str = name;
                                    }
                                    db6Var.B1(str, new veb(0, fgbVar, lowerCase));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } else if (fgbVar.u2 <= 3) {
                        if (fgbVar.Q0() || fgbVar.k2()) {
                            fgbVar.d1().x1();
                        }
                        fgbVar.u2++;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                break;
            default:
                q5z q5zVar = (q5z) obj;
                q5zVar.getClass();
                ((Function1) obj2).invoke(q5zVar);
                break;
        }
        return Unit.a;
    }
}
