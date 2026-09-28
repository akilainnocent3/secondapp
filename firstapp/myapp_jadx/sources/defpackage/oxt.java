package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.loyalty.CancelMissionRequest;
import com.sporty.android.core.model.loyalty.ParticipateMissionRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class oxt implements ixt {
    public final x430 a;
    public final psv b;
    public final rlw c;

    public oxt(x430 x430Var, psv psvVar, rlw rlwVar) {
        x430Var.getClass();
        psvVar.getClass();
        rlwVar.getClass();
        this.a = x430Var;
        this.b = psvVar;
        this.c = rlwVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:12:0x0028, B:23:0x0052, B:25:0x0067, B:27:0x0074, B:28:0x0079, B:29:0x0080), top: B:58:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ixt
    public final Object a(int i, x1b x1bVar) {
        kxt kxtVar;
        UiText uiText;
        Object bVar;
        UiText text;
        ArrayList arrayListA;
        int size;
        int i2;
        Object obj;
        if (x1bVar instanceof kxt) {
            kxtVar = (kxt) x1bVar;
            int i3 = kxtVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kxtVar.e = i3 - Integer.MIN_VALUE;
            } else {
                kxtVar = new kxt(this, x1bVar);
            }
        } else {
            kxtVar = new kxt(this, x1bVar);
        }
        Object obj2 = kxtVar.c;
        y5b y5bVar = y5b.a;
        int i4 = kxtVar.e;
        if (i4 == 0) {
            uj50.b(obj2);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                x430 x430Var = this.a;
                Integer num = new Integer(i);
                kxtVar.b = resourceUiText;
                kxtVar.a = i;
                kxtVar.e = 1;
                Object objZ = x430Var.z(num, kxtVar);
                if (objZ == y5bVar) {
                    return y5bVar;
                }
                uiText = resourceUiText;
                obj2 = objZ;
                arrayListA = this.b.a((List) n52.b((BaseResponse) obj2));
                size = arrayListA.size();
                i2 = 0;
                do {
                    if (i2 < size) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    obj = arrayListA.get(i2);
                    i2++;
                } while (((osv) obj).a != i);
                bVar = (osv) obj;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = kxtVar.a;
            uiText = kxtVar.b;
            try {
                uj50.b(obj2);
                arrayListA = this.b.a((List) n52.b((BaseResponse) obj2));
                size = arrayListA.size();
                i2 = 0;
                do {
                    if (i2 < size) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    obj = arrayListA.get(i2);
                    i2++;
                } while (((osv) obj).a != i);
                bVar = (osv) obj;
                zi50.a aVar4 = zi50.b;
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar5 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        Object obj3 = bVar instanceof zi50.b ? null : bVar;
        if (obj3 != null) {
            return new lk50.c(obj3);
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

    @Override // defpackage.ixt
    public final yzh b(ParticipateMissionRequest participateMissionRequest) {
        return bm50.a(new or60(new nxt(this, participateMissionRequest, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ixt
    public final Object c(long j, x1b x1bVar) {
        jxt jxtVar;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof jxt) {
            jxtVar = (jxt) x1bVar;
            int i = jxtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jxtVar.d = i - Integer.MIN_VALUE;
            } else {
                jxtVar = new jxt(this, x1bVar);
            }
        } else {
            jxtVar = new jxt(this, x1bVar);
        }
        Object obj = jxtVar.b;
        y5b y5bVar = y5b.a;
        int i2 = jxtVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                x430 x430Var = this.a;
                CancelMissionRequest cancelMissionRequest = new CancelMissionRequest(j);
                jxtVar.a = resourceUiText;
                jxtVar.d = 1;
                Object objJ = x430Var.j(cancelMissionRequest, jxtVar);
                if (objJ == y5bVar) {
                    return y5bVar;
                }
                obj = objJ;
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
            uiText = jxtVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        n52.c((BaseResponse) obj);
        bVar = Unit.a;
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

    @Override // defpackage.ixt
    public final yzh d() {
        return bm50.a(new or60(new lxt(this, null)));
    }

    @Override // defpackage.ixt
    public final yzh e() {
        return bm50.a(new or60(new mxt(this, null)));
    }
}
