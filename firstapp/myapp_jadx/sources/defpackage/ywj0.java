package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ywj0 extends z9g<owj0> {
    @Override // defpackage.v390
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.z9g
    public final void d(bge0 bge0Var, owj0 owj0Var) throws IOException {
        int i;
        int i2;
        int[] iArrZ0;
        int[] iArrZ1;
        byte[] byteArray;
        byte[] byteArray2;
        owj0 owj0Var2 = owj0Var;
        int i3 = 1;
        bge0Var.C0(1, owj0Var2.a);
        bge0Var.q(2, qxj0.f(owj0Var2.b));
        bge0Var.C0(3, owj0Var2.c);
        bge0Var.C0(4, owj0Var2.d);
        c cVar = owj0Var2.e;
        c cVar2 = c.b;
        bge0Var.Z0(5, c.b.b(cVar));
        bge0Var.Z0(6, c.b.b(owj0Var2.f));
        bge0Var.q(7, owj0Var2.g);
        bge0Var.q(8, owj0Var2.h);
        bge0Var.q(9, owj0Var2.i);
        bge0Var.q(10, owj0Var2.k);
        nt1 nt1Var = owj0Var2.l;
        nt1Var.getClass();
        int iOrdinal = nt1Var.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            i = 1;
        }
        bge0Var.q(11, i);
        bge0Var.q(12, owj0Var2.m);
        bge0Var.q(13, owj0Var2.n);
        bge0Var.q(14, owj0Var2.o);
        bge0Var.q(15, owj0Var2.p);
        bge0Var.q(16, owj0Var2.q ? 1L : 0L);
        x7z x7zVar = owj0Var2.r;
        x7zVar.getClass();
        int iOrdinal2 = x7zVar.ordinal();
        if (iOrdinal2 == 0) {
            i2 = 0;
        } else {
            if (iOrdinal2 != 1) {
                uhc.a();
                return;
            }
            i2 = 1;
        }
        bge0Var.q(17, i2);
        bge0Var.q(18, owj0Var2.s);
        bge0Var.q(19, owj0Var2.t);
        bge0Var.q(20, owj0Var2.u);
        bge0Var.q(21, owj0Var2.v);
        bge0Var.q(22, owj0Var2.w);
        String str = owj0Var2.x;
        if (str == null) {
            bge0Var.r(23);
        } else {
            bge0Var.C0(23, str);
        }
        lxa lxaVar = owj0Var2.j;
        sox soxVar = lxaVar.a;
        soxVar.getClass();
        int iOrdinal3 = soxVar.ordinal();
        if (iOrdinal3 == 0) {
            i3 = 0;
        } else if (iOrdinal3 != 1) {
            if (iOrdinal3 == 2) {
                i3 = 2;
            } else if (iOrdinal3 == 3) {
                i3 = 3;
            } else if (iOrdinal3 == 4) {
                i3 = 4;
            } else if (Build.VERSION.SDK_INT < 30 || soxVar != sox.f) {
                zqh0.a(soxVar, "Could not convert ", " to int");
                i3 = 0;
            } else {
                i3 = 5;
            }
        }
        bge0Var.q(24, i3);
        ynx ynxVar = lxaVar.b;
        ynxVar.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 28) {
            byteArray = new byte[0];
        } else {
            NetworkRequest networkRequest = (NetworkRequest) ynxVar.a;
            if (networkRequest == null) {
                byteArray = new byte[0];
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        if (i4 >= 31) {
                            iArrZ0 = vnx.b(networkRequest);
                        } else {
                            int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                            ArrayList arrayList = new ArrayList();
                            for (int i5 = 0; i5 < 10; i5++) {
                                int i6 = iArr[i5];
                                if (unx.c(networkRequest, i6)) {
                                    arrayList.add(Integer.valueOf(i6));
                                }
                            }
                            iArrZ0 = CollectionsKt.z0(arrayList);
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            iArrZ1 = vnx.a(networkRequest);
                        } else {
                            int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                            ArrayList arrayList2 = new ArrayList();
                            for (int i7 = 0; i7 < 30; i7++) {
                                int i8 = iArr2[i7];
                                if (unx.b(networkRequest, i8)) {
                                    arrayList2.add(Integer.valueOf(i8));
                                }
                            }
                            iArrZ1 = CollectionsKt.z0(arrayList2);
                        }
                        objectOutputStream.writeInt(iArrZ0.length);
                        for (int i9 : iArrZ0) {
                            objectOutputStream.writeInt(i9);
                        }
                        objectOutputStream.writeInt(iArrZ1.length);
                        for (int i10 : iArrZ1) {
                            objectOutputStream.writeInt(i10);
                        }
                        Unit unit = Unit.a;
                        objectOutputStream.close();
                        byteArrayOutputStream.close();
                        byteArray = byteArrayOutputStream.toByteArray();
                        byteArray.getClass();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ft7.a(objectOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ft7.a(byteArrayOutputStream, th3);
                        throw th4;
                    }
                }
            }
        }
        bge0Var.Z0(25, byteArray);
        bge0Var.q(26, lxaVar.c ? 1L : 0L);
        bge0Var.q(27, lxaVar.d ? 1L : 0L);
        bge0Var.q(28, lxaVar.e ? 1L : 0L);
        bge0Var.q(29, lxaVar.f ? 1L : 0L);
        bge0Var.q(30, lxaVar.g);
        bge0Var.q(31, lxaVar.h);
        Set<lxa.a> set = lxaVar.i;
        set.getClass();
        if (set.isEmpty()) {
            byteArray2 = new byte[0];
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                try {
                    objectOutputStream2.writeInt(set.size());
                    for (lxa.a aVar : set) {
                        objectOutputStream2.writeUTF(aVar.a.toString());
                        objectOutputStream2.writeBoolean(aVar.b);
                    }
                    Unit unit2 = Unit.a;
                    objectOutputStream2.close();
                    byteArrayOutputStream2.close();
                    byteArray2 = byteArrayOutputStream2.toByteArray();
                    byteArray2.getClass();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        ft7.a(objectOutputStream2, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    ft7.a(byteArrayOutputStream2, th7);
                    throw th8;
                }
            }
        }
        bge0Var.Z0(32, byteArray2);
    }
}
