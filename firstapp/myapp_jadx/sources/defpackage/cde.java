package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes4.dex */
public final class cde implements ysm {
    public final Context a;
    public final m2l b;
    public final odd c;
    public final v5b d;
    public final tuw e;
    public final AtomicReference<ysm.a> f;

    public cde(Context context, m2l m2lVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, @ApplicationScope v5b v5bVar) {
        m2lVar.getClass();
        v5bVar.getClass();
        this.a = context;
        this.b = m2lVar;
        this.c = oddVar;
        this.d = v5bVar;
        this.e = uuw.a();
        this.f = new AtomicReference<>(null);
        ej5.c(v5bVar, oddVar, null, new vce(this, null), 2);
    }

    @Override // defpackage.ysm
    @fae
    public final ysm.a a() {
        ysm.a aVar = this.f.get();
        if (aVar != null) {
            return aVar;
        }
        ib5.a("Device identifiers are not loaded yet. Call awaitUserIdentifiers() during startup before using sync accessors.");
        return null;
    }

    @Override // defpackage.ysm
    public final String c(String str) {
        String str2;
        str.getClass();
        ysm.a aVar = this.f.get();
        if (aVar != null && (str2 = aVar.a) != null) {
            return str2;
        }
        String str3 = (String) dj5.a(e.a, new ade(this, null));
        return str3 == null ? str : str3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ysm
    public final Object d(x1b x1bVar) {
        xce xceVar;
        quw quwVar;
        Throwable th;
        quw quwVar2;
        ysm.a aVar;
        if (x1bVar instanceof xce) {
            xceVar = (xce) x1bVar;
            int i = xceVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xceVar.d = i - Integer.MIN_VALUE;
            } else {
                xceVar = new xce(this, x1bVar);
            }
        } else {
            xceVar = new xce(this, x1bVar);
        }
        Object obj = xceVar.b;
        y5b y5bVar = y5b.a;
        int i2 = xceVar.d;
        AtomicReference<ysm.a> atomicReference = this.f;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                ysm.a aVar2 = atomicReference.get();
                if (aVar2 != null) {
                    return aVar2;
                }
                quwVar = this.e;
                xceVar.a = quwVar;
                xceVar.d = 1;
                if (quwVar.d(xceVar) != y5bVar) {
                }
                return y5bVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quwVar2 = xceVar.a;
                try {
                    uj50.b(obj);
                    atomicReference.set((ysm.a) obj);
                    aVar = (ysm.a) obj;
                    quwVar = quwVar2;
                    quwVar.f(null);
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    quwVar2.f(null);
                    throw th;
                }
            }
            quw quwVar3 = xceVar.a;
            uj50.b(obj);
            quwVar = quwVar3;
            aVar = atomicReference.get();
            if (aVar == null) {
                odd oddVar = this.c;
                yce yceVar = new yce(this, null);
                xceVar.a = quwVar;
                xceVar.d = 2;
                Object objD = ej5.d(oddVar, yceVar, xceVar);
                if (objD != y5bVar) {
                    quw quwVar4 = quwVar;
                    obj = objD;
                    quwVar2 = quwVar4;
                    atomicReference.set((ysm.a) obj);
                    aVar = (ysm.a) obj;
                    quwVar = quwVar2;
                }
                return y5bVar;
            }
            quwVar.f(null);
            return aVar;
        } catch (Throwable th3) {
            quw quwVar5 = quwVar;
            th = th3;
            quwVar2 = quwVar5;
            quwVar2.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(x1b x1bVar) {
        zce zceVar;
        String string;
        if (x1bVar instanceof zce) {
            zceVar = (zce) x1bVar;
            int i = zceVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zceVar.d = i - Integer.MIN_VALUE;
            } else {
                zceVar = new zce(this, x1bVar);
            }
        } else {
            zceVar = new zce(this, x1bVar);
        }
        Object objF = zceVar.b;
        y5b y5bVar = y5b.a;
        int i2 = zceVar.d;
        m2l m2lVar = this.b;
        if (i2 == 0) {
            uj50.b(objF);
            wm20 wm20VarA = m2lVar.c.a(m2lVar, m2l.e[1]);
            zceVar.d = 1;
            objF = wm20VarA.f(zceVar);
            if (objF != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = zceVar.a;
            uj50.b(objF);
            return str;
        }
        uj50.b(objF);
        String str2 = (String) objF;
        if (str2 != null) {
            return str2;
        }
        String string2 = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        if (string2 != null && string2.length() >= 10 && !TextUtils.equals("02:00:00:00:00:00", string2)) {
            int length = string2.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    string = UUID.randomUUID().toString();
                    string.getClass();
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_COMMON);
                    aVar.a("create device id by Random-UUID: %s", string);
                    break;
                }
                if (string2.charAt(i3) != '0' && string2.charAt(i3) != ':') {
                    string = t3c.a(string2).toLowerCase(Locale.ROOT);
                    string.getClass();
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.a("create device id by AndroidId: %s", string);
                    break;
                }
                i3++;
            }
        } else {
            string = UUID.randomUUID().toString();
            string.getClass();
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.a("create device id by Random-UUID: %s", string);
            break;
        }
        wm20 wm20VarA2 = m2lVar.c.a(m2lVar, m2l.e[1]);
        zceVar.a = string;
        zceVar.d = 2;
        return wm20VarA2.g(zceVar, string) == y5bVar ? y5bVar : string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(x1b x1bVar) {
        bde bdeVar;
        if (x1bVar instanceof bde) {
            bdeVar = (bde) x1bVar;
            int i = bdeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bdeVar.d = i - Integer.MIN_VALUE;
            } else {
                bdeVar = new bde(this, x1bVar);
            }
        } else {
            bdeVar = new bde(this, x1bVar);
        }
        Object objF = bdeVar.b;
        y5b y5bVar = y5b.a;
        int i2 = bdeVar.d;
        m2l m2lVar = this.b;
        if (i2 == 0) {
            uj50.b(objF);
            wm20 wm20VarA = m2lVar.d.a(m2lVar, m2l.e[2]);
            bdeVar.d = 1;
            objF = wm20VarA.f(bdeVar);
            if (objF != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = bdeVar.a;
            uj50.b(objF);
            return str;
        }
        uj50.b(objF);
        String string = (String) objF;
        if (string == null) {
            soh.c.getClass();
            string = soh.d;
            if (string.length() > 0) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.a("create fingerprints by Firebase instance id: %s", string);
            } else {
                string = UUID.randomUUID().toString();
                string.getClass();
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_COMMON);
                aVar2.a("create fingerprints by Random-UUID: %s", string);
            }
            wm20 wm20VarA2 = m2lVar.d.a(m2lVar, m2l.e[2]);
            bdeVar.a = string;
            bdeVar.d = 2;
            if (wm20VarA2.g(bdeVar, string) == y5bVar) {
                return y5bVar;
            }
        }
        return string;
    }
}
