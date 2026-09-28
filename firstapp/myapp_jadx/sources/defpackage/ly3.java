package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ly3 implements gy3 {
    public final rqt a;

    public ly3(rqt rqtVar, jy8 jy8Var) {
        rqtVar.getClass();
        this.a = rqtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gy3
    public final Object a(long j, x1b x1bVar) {
        ky3 ky3Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof ky3) {
            ky3Var = (ky3) x1bVar;
            int i = ky3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ky3Var.d = i - Integer.MIN_VALUE;
            } else {
                ky3Var = new ky3(this, x1bVar);
            }
        } else {
            ky3Var = new ky3(this, x1bVar);
        }
        Object obj = ky3Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ky3Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                rqt rqtVar = this.a;
                ky3Var.a = resourceUiText;
                ky3Var.d = 1;
                Object objE = rqtVar.e(j, ky3Var);
                if (objE == y5bVar) {
                    return y5bVar;
                }
                obj = objE;
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = ky3Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = jy8.a((zw3) n52.b((BaseResponse) obj));
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gy3
    public final Object b(boolean z, x1b x1bVar) {
        jy3 jy3Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof jy3) {
            jy3Var = (jy3) x1bVar;
            int i = jy3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jy3Var.d = i - Integer.MIN_VALUE;
            } else {
                jy3Var = new jy3(this, x1bVar);
            }
        } else {
            jy3Var = new jy3(this, x1bVar);
        }
        Object obj = jy3Var.b;
        y5b y5bVar = y5b.a;
        int i2 = jy3Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                rqt rqtVar = this.a;
                jy3Var.a = resourceUiText;
                jy3Var.d = 1;
                Object objA = rqtVar.a(z, jy3Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                obj = objA;
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = jy3Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        zy3 zy3Var = (zy3) n52.b((BaseResponse) obj);
        zy3Var.getClass();
        int pickAmount = zy3Var.getPickAmount();
        List<zw3> listB = zy3Var.b();
        ArrayList arrayList = new ArrayList(l48.r(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(jy8.a((zw3) it.next()));
        }
        bVar = new wy3(pickAmount, arrayList);
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gy3
    public final Object c(x1b x1bVar) {
        iy3 iy3Var;
        Throwable th;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof iy3) {
            iy3Var = (iy3) x1bVar;
            int i = iy3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iy3Var.d = i - Integer.MIN_VALUE;
            } else {
                iy3Var = new iy3(this, x1bVar);
            }
        } else {
            iy3Var = new iy3(this, x1bVar);
        }
        Object obj = iy3Var.b;
        y5b y5bVar = y5b.a;
        int i2 = iy3Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                rqt rqtVar = this.a;
                iy3Var.a = resourceUiText;
                iy3Var.d = 1;
                Object objB = rqtVar.b(iy3Var);
                if (objB == y5bVar) {
                    return y5bVar;
                }
                obj = objB;
                uiText = resourceUiText;
            } catch (Throwable th2) {
                th = th2;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = iy3Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        kw3 kw3Var = (kw3) n52.b((BaseResponse) obj);
        kw3Var.getClass();
        bVar = new jw3(kw3Var.getNewThemeAvailable(), kw3Var.getNewThemeMissionAvailable(), kw3Var.getThemeMissionOngoing());
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gy3
    public final Object d(long j, x1b x1bVar) {
        hy3 hy3Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof hy3) {
            hy3Var = (hy3) x1bVar;
            int i = hy3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hy3Var.d = i - Integer.MIN_VALUE;
            } else {
                hy3Var = new hy3(this, x1bVar);
            }
        } else {
            hy3Var = new hy3(this, x1bVar);
        }
        Object obj = hy3Var.b;
        y5b y5bVar = y5b.a;
        int i2 = hy3Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                rqt rqtVar = this.a;
                hy3Var.a = resourceUiText;
                hy3Var.d = 1;
                Object objC = rqtVar.c(j, hy3Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
                obj = objC;
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = hy3Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = jy8.a((zw3) n52.b((BaseResponse) obj));
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }
}
