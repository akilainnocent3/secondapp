package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.c;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class hqa implements eoc {
    public final m2l a;
    public final k5b b;
    public final str<k5b> c;
    public final mpe0 d;
    public final mpe0 e;
    public final v340 f;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ThemeConfig.values().length];
            try {
                iArr[ThemeConfig.THEME_CONFIG_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeConfig.THEME_CONFIG_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeConfig.THEME_CONFIG_FOLLOW_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b implements lyh<ThemeConfig> {
        public final /* synthetic */ zed.s a;

        @c0d(c = "com.sportybet.domain.ConfigureDarkModeSettingsUseCase$special$$inlined$map$1", f = "ConfigureDarkModeSettingsUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: hqa$b$b, reason: collision with other inner class name */
        public static final class C0652b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: hqa$b$b$a */
            @c0d(c = "com.sportybet.domain.ConfigureDarkModeSettingsUseCase$special$$inlined$map$1$2", f = "ConfigureDarkModeSettingsUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0652b.this.emit(null, this);
                }
            }

            public C0652b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    ThemeConfig themeConfigInvoke = ThemeConfig.INSTANCE.invoke(((Number) obj).intValue());
                    aVar.b = 1;
                    if (this.a.emit(themeConfigInvoke, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(zed.s sVar) {
            this.a = sVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super ThemeConfig> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                C0652b c0652b = new C0652b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0652b, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public hqa(m2l m2lVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, @Dispatcher(sportyDispatcher = SportyDispatchers.Main) str<k5b> strVar) {
        m2lVar.getClass();
        strVar.getClass();
        this.a = m2lVar;
        this.b = k5bVar;
        this.c = strVar;
        mpe0 mpe0VarB = hwr.b(new gqa(this, 0));
        this.d = mpe0VarB;
        this.e = hwr.b(new na1(this, 1));
        this.f = e1i.e(new b((zed.s) m2lVar.a.getIntFlow("dark_theme", 0)), (v5b) mpe0VarB.getValue(), q490.a.a, ThemeConfig.INSTANCE.invoke(0));
    }

    public static void c(Context context, ThemeConfig themeConfig) {
        int i = 2;
        if (Build.VERSION.SDK_INT < 31) {
            int i2 = a.a[themeConfig.ordinal()];
            if (i2 != 1) {
                i = i2 != 2 ? -1 : 1;
            }
            c.B(i);
            return;
        }
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        UiModeManager uiModeManager = (UiModeManager) systemService;
        int i3 = a.a[themeConfig.ordinal()];
        if (i3 != 1) {
            i = i3 != 2 ? 0 : 1;
        }
        uiModeManager.setApplicationNightMode(i);
    }

    @Override // defpackage.eoc
    public final Object a(ThemeConfig themeConfig, jhv jhvVar) {
        return this.a.a.putInt("dark_theme", new Integer(themeConfig.ordinal()), jhvVar);
    }

    @Override // defpackage.eoc
    public final v340 b() {
        return this.f;
    }
}
