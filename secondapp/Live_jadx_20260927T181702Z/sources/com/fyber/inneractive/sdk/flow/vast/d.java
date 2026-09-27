package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f45005b;

    public d(int i10, int i11) {
        int i12 = i10 * i11;
        this.f45004a = i12;
        float f10 = i10 / i11;
        this.f45005b = f10;
        IAlog.a("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Float.valueOf(f10));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        com.fyber.inneractive.sdk.model.vast.c cVar = (com.fyber.inneractive.sdk.model.vast.c) obj;
        com.fyber.inneractive.sdk.model.vast.c cVar2 = (com.fyber.inneractive.sdk.model.vast.c) obj2;
        int iA = v.a(cVar.f45180h, cVar2.f45180h);
        if (iA != 0) {
            return iA;
        }
        com.fyber.inneractive.sdk.model.vast.i iVar = cVar.f45173a;
        com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Html;
        int i11 = Integer.MAX_VALUE;
        if (iVar == iVar2) {
            i10 = 1;
        } else if (iVar == com.fyber.inneractive.sdk.model.vast.i.Iframe) {
            i10 = 2;
        } else {
            i10 = iVar == com.fyber.inneractive.sdk.model.vast.i.Static ? 3 : Integer.MAX_VALUE;
        }
        com.fyber.inneractive.sdk.model.vast.i iVar3 = cVar2.f45173a;
        if (iVar3 == iVar2) {
            i11 = 1;
        } else if (iVar3 == com.fyber.inneractive.sdk.model.vast.i.Iframe) {
            i11 = 2;
        } else if (iVar3 == com.fyber.inneractive.sdk.model.vast.i.Static) {
            i11 = 3;
        }
        int iA2 = v.a(i10, i11);
        if (iA2 != 0) {
            return iA2;
        }
        int iCompare = Float.compare(Math.abs((cVar.f45175c / cVar.f45176d) - this.f45005b), Math.abs((cVar2.f45175c / cVar2.f45176d) - this.f45005b));
        if (iCompare != 0) {
            return iCompare;
        }
        return v.a(Math.abs((cVar.f45175c * cVar.f45176d) - this.f45004a), Math.abs((cVar2.f45175c * cVar2.f45176d) - this.f45004a));
    }
}
