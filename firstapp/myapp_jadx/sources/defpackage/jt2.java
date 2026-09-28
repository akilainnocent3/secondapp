package defpackage;

import androidx.recyclerview.widget.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class jt2 extends n.e<ipc> {
    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(ipc ipcVar, ipc ipcVar2) {
        ipc ipcVar3 = ipcVar;
        ipc ipcVar4 = ipcVar2;
        ipcVar3.getClass();
        ipcVar4.getClass();
        return Intrinsics.g(ipcVar3, ipcVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(ipc ipcVar, ipc ipcVar2) {
        ipc ipcVar3 = ipcVar;
        ipc ipcVar4 = ipcVar2;
        ipcVar3.getClass();
        ipcVar4.getClass();
        return ipcVar3.a() == ipcVar4.a();
    }
}
