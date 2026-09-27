package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzg implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = iZza;
        if (iZza != 0) {
            selectionResult.selection = 1;
            return selectionResult;
        }
        int iZzb = iVersions.zzb(context, str);
        selectionResult.localVersion = iZzb;
        if (iZzb != 0) {
            selectionResult.selection = -1;
        }
        return selectionResult;
    }
}
