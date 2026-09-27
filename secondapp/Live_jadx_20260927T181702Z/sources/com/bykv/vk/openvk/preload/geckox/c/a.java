package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a extends com.bykv.vk.openvk.preload.a.a<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.vk.openvk.preload.a.a
    public final /* synthetic */ String a(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        if (packageType == 0) {
            return "branch_zip";
        }
        if (packageType == 1) {
            return "branch_single_file";
        }
        throw new RuntimeException("unknow file type: ".concat(String.valueOf(packageType)));
    }
}
