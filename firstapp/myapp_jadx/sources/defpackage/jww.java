package defpackage;

import androidx.fragment.app.e;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class jww {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MyFavoriteTypeEnum.values().length];
            a = iArr;
            try {
                iArr[MyFavoriteTypeEnum.STAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MyFavoriteTypeEnum.MY_ODDS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MyFavoriteTypeEnum.TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MyFavoriteTypeEnum.SEARCH_TEAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MyFavoriteTypeEnum.MARKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MyFavoriteTypeEnum.LEAGUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MyFavoriteTypeEnum.SPORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static iww a(e eVar, MyFavoriteTypeEnum myFavoriteTypeEnum) {
        switch (a.a[myFavoriteTypeEnum.ordinal()]) {
            case 1:
                eVar.getClass();
                v8i0 viewModelStore = eVar.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory = eVar.getDefaultViewModelProviderFactory();
                s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVar, viewModelStore, defaultViewModelProviderFactory));
                dq7 dq7VarA = jq40.a(a2x.class);
                String strI = dq7VarA.i();
                if (strI != null) {
                    return (iww) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return null;
            case 2:
                eVar.getClass();
                v8i0 viewModelStore2 = eVar.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory2 = eVar.getDefaultViewModelProviderFactory();
                s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(eVar, viewModelStore2, defaultViewModelProviderFactory2));
                dq7 dq7VarA2 = jq40.a(sxw.class);
                String strI2 = dq7VarA2.i();
                if (strI2 != null) {
                    return (iww) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return null;
            case 3:
                eVar.getClass();
                v8i0 viewModelStore3 = eVar.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory3 = eVar.getDefaultViewModelProviderFactory();
                s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, sd7.a(eVar, viewModelStore3, defaultViewModelProviderFactory3));
                dq7 dq7VarA3 = jq40.a(eww.class);
                String strI3 = dq7VarA3.i();
                if (strI3 != null) {
                    return (iww) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return null;
            case 4:
                eVar.getClass();
                v8i0 viewModelStore4 = eVar.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory4 = eVar.getDefaultViewModelProviderFactory();
                s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, sd7.a(eVar, viewModelStore4, defaultViewModelProviderFactory4));
                dq7 dq7VarA4 = jq40.a(xvw.class);
                String strI4 = dq7VarA4.i();
                if (strI4 != null) {
                    return (iww) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return null;
            case 5:
                eVar.getClass();
                v8i0 viewModelStore5 = eVar.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory5 = eVar.getDefaultViewModelProviderFactory();
                s8i0 s8i0Var5 = new s8i0(viewModelStore5, defaultViewModelProviderFactory5, sd7.a(eVar, viewModelStore5, defaultViewModelProviderFactory5));
                dq7 dq7VarA5 = jq40.a(uvw.class);
                String strI5 = dq7VarA5.i();
                if (strI5 != null) {
                    return (iww) s8i0Var5.a(dq7VarA5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI5));
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return null;
            case 6:
                eVar.getClass();
                v8i0 viewModelStore6 = eVar.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory6 = eVar.getDefaultViewModelProviderFactory();
                s8i0 s8i0Var6 = new s8i0(viewModelStore6, defaultViewModelProviderFactory6, sd7.a(eVar, viewModelStore6, defaultViewModelProviderFactory6));
                dq7 dq7VarA6 = jq40.a(rvw.class);
                String strI6 = dq7VarA6.i();
                if (strI6 != null) {
                    return (iww) s8i0Var6.a(dq7VarA6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI6));
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return null;
            default:
                eVar.getClass();
                v8i0 viewModelStore7 = eVar.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory7 = eVar.getDefaultViewModelProviderFactory();
                s8i0 s8i0Var7 = new s8i0(viewModelStore7, defaultViewModelProviderFactory7, sd7.a(eVar, viewModelStore7, defaultViewModelProviderFactory7));
                dq7 dq7VarA7 = jq40.a(cww.class);
                String strI7 = dq7VarA7.i();
                if (strI7 != null) {
                    return (iww) s8i0Var7.a(dq7VarA7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI7));
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return null;
        }
    }
}
