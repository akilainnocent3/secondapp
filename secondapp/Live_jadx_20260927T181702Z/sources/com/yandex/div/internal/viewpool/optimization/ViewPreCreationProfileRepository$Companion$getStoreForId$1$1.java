package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import ds.a;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewPreCreationProfileRepository$Companion$getStoreForId$1$1 extends o0 implements a<File> {
    final /* synthetic */ String $id;
    final /* synthetic */ Context $this_getStoreForId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPreCreationProfileRepository$Companion$getStoreForId$1$1(Context context, String str) {
        super(0);
        this.$this_getStoreForId = context;
        this.$id = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final File invoke() {
        File filesDir = this.$this_getStoreForId.getFilesDir();
        String str = String.format(ViewPreCreationProfileRepository.STORE_PATH, Arrays.copyOf(new Object[]{this.$id}, 1));
        m0.o(str, "format(...)");
        return new File(filesDir, str);
    }
}
