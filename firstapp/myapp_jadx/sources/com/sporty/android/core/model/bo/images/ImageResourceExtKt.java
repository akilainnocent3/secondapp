package com.sporty.android.core.model.bo.images;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0086\bø\u0001\u0000\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"onSuccess", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource;", "Lkotlin/Function1;", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource$Data;", "", "onFailure", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource$Error;", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class ImageResourceExtKt {
    public static final ImageBOTypes.ImageResource onFailure(ImageBOTypes.ImageResource imageResource, Function1<? super ImageBOTypes.ImageResource.Error, Unit> function1) {
        imageResource.getClass();
        function1.getClass();
        if (imageResource instanceof ImageBOTypes.ImageResource.Error) {
            function1.invoke(imageResource);
        }
        return imageResource;
    }

    public static final ImageBOTypes.ImageResource onSuccess(ImageBOTypes.ImageResource imageResource, Function1<? super ImageBOTypes.ImageResource.Data, Unit> function1) {
        imageResource.getClass();
        function1.getClass();
        if (imageResource instanceof ImageBOTypes.ImageResource.Data) {
            function1.invoke(imageResource);
        }
        return imageResource;
    }
}
