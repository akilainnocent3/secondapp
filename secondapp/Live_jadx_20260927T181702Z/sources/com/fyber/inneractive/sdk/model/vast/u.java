package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import java.util.ArrayList;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f45230b;

    public static u a(Node node) {
        f fVar;
        u uVar = new u();
        uVar.f45229a = w1.b(node, "version");
        ArrayList<Node> arrayListC = w1.c(node, "Ad");
        if (!arrayListC.isEmpty()) {
            uVar.f45230b = new ArrayList();
            for (Node node2 : arrayListC) {
                if (node2 == null) {
                    fVar = null;
                } else {
                    f fVar2 = new f();
                    fVar2.f45186a = w1.b(node2, "id");
                    Node nodeD = w1.d(node2, "Wrapper");
                    if (nodeD != null) {
                        fVar2.f45187b = a0.c(nodeD);
                    }
                    Node nodeD2 = w1.d(node2, "InLine");
                    if (nodeD2 != null) {
                        fVar2.f45188c = p.c(nodeD2);
                    }
                    fVar = fVar2;
                }
                uVar.f45230b.add(fVar);
            }
        }
        return uVar;
    }

    public final String toString() {
        return new StringBuilder("Vast: version - " + this.f45229a + "\nAds: ").toString();
    }
}
