package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.appupdate.AppDownloadAction;
import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.appupdate.VersionCheckResults;
import com.sporty.android.core.model.config.VersionData;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.update.ForceUpdateActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly1i0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y1i0 extends j8i0 {
    public final fhb0 a;
    public boolean b;

    @c0d(c = "com.sportybet.android.update.viewmodel.VersionCheckViewModel$initNavigation$1", f = "VersionCheckViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<VersionCheckResults, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ kkh0 c;
        public final /* synthetic */ y1i0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kkh0 kkh0Var, y1i0 y1i0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = kkh0Var;
            this.d = y1i0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(VersionCheckResults versionCheckResults, v1b<? super Unit> v1bVar) {
            return ((a) create(versionCheckResults, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            VersionCheckResults versionCheckResults = (VersionCheckResults) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                boolean z = versionCheckResults instanceof VersionCheckResults.UpdateRequired;
                kkh0 kkh0Var = this.c;
                if (z) {
                    VersionData data = ((VersionCheckResults.UpdateRequired) versionCheckResults).getData();
                    kkh0Var.getClass();
                    data.getClass();
                    Context context = kkh0Var.a;
                    int i2 = ForceUpdateActivity.a;
                    Intent intent = new Intent(context, (Class<?>) ForceUpdateActivity.class);
                    intent.putExtra("extra_version_data", data);
                    context.startActivity(intent);
                } else if (versionCheckResults instanceof VersionCheckResults.UpdateAvailable) {
                    VersionData data2 = ((VersionCheckResults.UpdateAvailable) versionCheckResults).getData();
                    this.b = null;
                    this.a = 1;
                    if (this.d.z1(data2, kkh0Var, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.update.viewmodel.VersionCheckViewModel$initNavigation$2", f = "VersionCheckViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<AppDownloadAction, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ kkh0 b;
        public final /* synthetic */ y1i0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kkh0 kkh0Var, y1i0 y1i0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = kkh0Var;
            this.c = y1i0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppDownloadAction appDownloadAction, v1b<? super Unit> v1bVar) {
            return ((b) create(appDownloadAction, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            AppDownloadAction appDownloadAction = (AppDownloadAction) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = appDownloadAction instanceof AppDownloadAction.OpenGooglePlayStore;
            kkh0 kkh0Var = this.b;
            if (z) {
                kkh0Var.b(((AppDownloadAction.OpenGooglePlayStore) appDownloadAction).getUrl());
            } else if (appDownloadAction instanceof AppDownloadAction.OpenHuaweiAppGallery) {
                kqm.a(kkh0Var.a);
            } else if (appDownloadAction instanceof AppDownloadAction.OpenPalmStore) {
                kkh0Var.a(((AppDownloadAction.OpenPalmStore) appDownloadAction).getUrl());
            } else if (appDownloadAction instanceof AppDownloadAction.DownloadApkPermissionCheck) {
                VersionData data = ((AppDownloadAction.DownloadApkPermissionCheck) appDownloadAction).getData();
                data.getClass();
                y1i0 y1i0Var = this.c;
                ej5.c(o8i0.d(y1i0Var), null, null, new z1i0(y1i0Var, data, null), 3);
            }
            return Unit.a;
        }
    }

    public y1i0(fhb0 fhb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = fhb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable x1(x1b x1bVar) {
        x1i0 x1i0Var;
        VersionData data;
        VersionData versionData;
        if (x1bVar instanceof x1i0) {
            x1i0Var = (x1i0) x1bVar;
            int i = x1i0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x1i0Var.d = i - Integer.MIN_VALUE;
            } else {
                x1i0Var = new x1i0(this, x1bVar);
            }
        } else {
            x1i0Var = new x1i0(this, x1bVar);
        }
        Object objB = x1i0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = x1i0Var.d;
        fhb0 fhb0Var = this.a;
        if (i2 == 0) {
            uj50.b(objB);
            x1i0Var.d = 1;
            objB = fhb0Var.b(x1i0Var);
            if (objB != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objB);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            versionData = x1i0Var.a;
            uj50.b(objB);
        }
        return new Pair((VersionAutoUpdateConfig) objB, versionData);
        VersionCheckResults versionCheckResults = (VersionCheckResults) objB;
        if (versionCheckResults instanceof VersionCheckResults.UpdateAvailable) {
            data = ((VersionCheckResults.UpdateAvailable) versionCheckResults).getData();
        } else {
            if (!(versionCheckResults instanceof VersionCheckResults.UpdateRequired)) {
                return null;
            }
            data = ((VersionCheckResults.UpdateRequired) versionCheckResults).getData();
        }
        x1i0Var.a = data;
        x1i0Var.d = 2;
        Enum enumC = fhb0Var.c(x1i0Var);
        if (enumC != y5bVar) {
            VersionData versionData2 = data;
            objB = enumC;
            versionData = versionData2;
            return new Pair((VersionAutoUpdateConfig) objB, versionData);
        }
        return y5bVar;
    }

    public final void y1(kkh0 kkh0Var) {
        kkh0Var.getClass();
        if (this.b) {
            return;
        }
        this.b = true;
        fhb0 fhb0Var = this.a;
        kzh.d(new g1i(fhb0Var.m, new a(kkh0Var, this, null)), o8i0.d(this));
        kzh.d(new g1i(fhb0Var.n, new b(kkh0Var, this, null)), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(VersionData versionData, kkh0 kkh0Var, x1b x1bVar) {
        b2i0 b2i0Var;
        VersionData versionData2;
        VersionAutoUpdateConfig versionAutoUpdateConfig;
        if (x1bVar instanceof b2i0) {
            b2i0Var = (b2i0) x1bVar;
            int i = b2i0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                b2i0Var.f = i - Integer.MIN_VALUE;
            } else {
                b2i0Var = new b2i0(this, x1bVar);
            }
        } else {
            b2i0Var = new b2i0(this, x1bVar);
        }
        Object objC = b2i0Var.d;
        y5b y5bVar = y5b.a;
        int i2 = b2i0Var.f;
        fhb0 fhb0Var = this.a;
        int i3 = 1;
        if (i2 == 0) {
            uj50.b(objC);
            b2i0Var.a = versionData;
            b2i0Var.b = kkh0Var;
            b2i0Var.f = 1;
            objC = fhb0Var.c(b2i0Var);
            if (objC != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            kkh0Var = b2i0Var.b;
            versionData = b2i0Var.a;
            uj50.b(objC);
        } else {
            if (i2 == 2) {
                uj50.b(objC);
                return objC;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            versionAutoUpdateConfig = b2i0Var.c;
            kkh0Var = b2i0Var.b;
            versionData2 = b2i0Var.a;
            uj50.b(objC);
        }
        if (((Boolean) objC).booleanValue()) {
            kkh0Var.c(versionAutoUpdateConfig, versionData2, new lp50(i3, this, versionData2));
        }
        return Unit.a;
        VersionAutoUpdateConfig versionAutoUpdateConfig2 = (VersionAutoUpdateConfig) objC;
        if (versionAutoUpdateConfig2 == VersionAutoUpdateConfig.ENABLED_WIFI_NETWORK) {
            b2i0Var.a = null;
            b2i0Var.b = null;
            b2i0Var.c = null;
            b2i0Var.f = 2;
            Object objH = fhb0Var.h(b2i0Var);
            if (objH != y5bVar) {
                return objH;
            }
        } else {
            b2i0Var.a = versionData;
            b2i0Var.b = kkh0Var;
            b2i0Var.c = versionAutoUpdateConfig2;
            b2i0Var.f = 3;
            Object objG = fhb0Var.g(versionData, b2i0Var);
            if (objG != y5bVar) {
                versionData2 = versionData;
                versionAutoUpdateConfig = versionAutoUpdateConfig2;
                objC = objG;
                if (((Boolean) objC).booleanValue()) {
                    kkh0Var.c(versionAutoUpdateConfig, versionData2, new lp50(i3, this, versionData2));
                }
                return Unit.a;
            }
        }
        return y5bVar;
    }
}
