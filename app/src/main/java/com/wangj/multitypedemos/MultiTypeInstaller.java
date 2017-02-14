/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wangj.multitypedemos;

import com.wangj.multitypedemos.entity.SectionEntity;
import com.wangj.multitypedemos.entity.SectionItem;
import com.wangj.multitypedemos.provider.SectionItemProvider;
import com.wangj.multitypedemos.provider.SectionViewProvider;

import me.drakeet.multitype.GlobalMultiTypePool;

/**
 * @author leon
 */
class MultiTypeInstaller {

    static void start() {
        GlobalMultiTypePool.register(SectionEntity.class,new SectionViewProvider());
        GlobalMultiTypePool.register(SectionItem.class,new SectionItemProvider());
    }
}
