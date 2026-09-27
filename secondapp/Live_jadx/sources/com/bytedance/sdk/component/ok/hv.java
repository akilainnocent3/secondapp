package com.bytedance.sdk.component.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {
    private static nod hww = new nod() { // from class: com.bytedance.sdk.component.ok.hv.1
        @Override // com.bytedance.sdk.component.ok.nod
        public rs hww(int i10, String str) {
            return new rs(i10, str);
        }
    };

    public static void hww(nod nodVar) {
        hww = nodVar;
    }

    public static nod hww() {
        return hww;
    }
}
